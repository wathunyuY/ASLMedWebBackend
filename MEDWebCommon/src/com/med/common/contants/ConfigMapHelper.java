package com.med.common.contants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.med.common.context.AppContextHelper;

public class ConfigMapHelper {

	private static Object lockObject = new Object();

	protected static ConcurrentHashMap<String, String> configMap = null;

//	private static final String SQL_SELECT_CONFIG = " select * from constants";
	private static final String SQL_SELECT_CONFIG = " select * from CONSTANTS";

	protected static void initialize() {

		synchronized (lockObject) {

			Connection conn = null;
			PreparedStatement psmt = null;
			ResultSet rs = null;

			try {
				if (null == configMap) {
					System.out.println("initialize config map");
					conn = AppContextHelper.getConnection();

					psmt = conn.prepareStatement(SQL_SELECT_CONFIG);
					rs = psmt.executeQuery();

					while (rs.next()) {

						if (null == configMap) {
							configMap = new ConcurrentHashMap<String, String>();
						}

						String _srcParam = rs.getString("SRC_PARAM");
						String _destParam = rs.getString("DST_PARAM");
						String _fix = rs.getString("VALUE");
						String key = _srcParam + "." + _destParam;
						configMap.put(key, _fix);
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (Exception e) {
					}

				if (psmt != null)
					try {
						psmt.close();
					} catch (Exception e) {
					}

				if (conn != null)
					try {
						conn.close();
					} catch (Exception e) {
					}
			}
		}
	}

	public static String getConfigValue(String key) {

		if (configMap == null) {
			initialize();
		}

		if (configMap.containsKey(key)) {
			return configMap.get(key);
		} else {
			return null;
		}
	}

	public static List<String> getConfigValueList(String key) {
		return Arrays.asList(getConfigValue(key).split("\\s*,\\s*"));
	}

	public static void clearConfig() {
		if (configMap != null) {
			configMap.clear();
			configMap = null;
		}
		return;
	}

}
