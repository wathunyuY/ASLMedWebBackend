package com.med.ws.controller.endpoint;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.parser.ParseException;

public class RequestHashMonkey {

	private static final String UTF_8 = "UTF-8";
	private static final String MD5 = "MD5";
	private Date timestamp;
	private String url;
	private byte[] hash;

	public RequestHashMonkey(HttpServletRequest request) throws NoSuchAlgorithmException, IOException, ParseException {
		super();
		setUrl(request.getRequestURL().toString());
//		CustomHttpRequestWrapper req = new CustomHttpRequestWrapper(request);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		StringBuilder lotzOStuff = new StringBuilder();
		
		// req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		// System.out.println("TEST: " + request.getReader().toString());
		// lotzOStuff.append(req.getBody());
		// @SuppressWarnings("unchecked")
		// Iterator<Map.Entry<String, String[]>> it =
		// request.getParameterMap().entrySet().iterator();
		// while (it.hasNext()) {
		// Map.Entry<String, String[]> pairs = it.next();
		// lotzOStuff.append(pairs.getKey());
		// lotzOStuff.append(Arrays.toString(pairs.getValue()));
		// System.out.println("value:" + Arrays.toString(pairs.getValue()));
		// }
		// ByteArrayOutputStream byteArrayOutputStream = new
		// ByteArrayOutputStream();
		// byte[] buffer = new byte[1024];
		// int len;
		// while ((len = request.getInputStream().read(buffer)) > -1 ) {
		// byteArrayOutputStream.write(buffer, 0, len);
		// }
		// byteArrayOutputStream.flush();

		// InputStream body = new
		// ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		// JSONParser jsonParser = new JSONParser();
		// JSONObject jsonObject = (JSONObject)jsonParser.parse(
		// new InputStreamReader(body, "UTF-8"));
		// Iterator<Map.Entry<String, Object>> jsonSet =
		// jsonObject.entrySet().iterator();
		// while (jsonSet.hasNext()) {
		// Map.Entry<String, Object> pairs = jsonSet.next();
		// lotzOStuff.append(pairs.getKey());
		// lotzOStuff.append(pairs.getValue());
		// System.out.println("value:" + (pairs.getValue()));
		// }
//		Scanner s = new Scanner(request.getInputStream(), "UTF-8").useDelimiter("\\A");
//		String test = s.hasNext() ? s.next() : "";
//		System.out.println("TEST: " + test);
		lotzOStuff.append(request.getHeader("Unique-Token"));
		System.out.println("UTOKEN: "+request.getHeader("Unique-Token"));
		lotzOStuff.append(request.getHeader("Authorization"));
		// lotzOStuff.append(req.getHeader("Time-Stamp"));
		setHash(MessageDigest.getInstance(MD5).digest(lotzOStuff.toString().getBytes(UTF_8)));
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public byte[] getHash() {
		return hash;
	}

	public void setHash(byte[] hash) {
		this.hash = hash;
	}

}