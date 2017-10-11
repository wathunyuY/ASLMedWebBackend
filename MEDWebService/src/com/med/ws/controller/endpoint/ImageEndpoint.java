package com.med.ws.controller.endpoint;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.HandlerMapping;

import com.med.common.contants.ConfigMapHelper;

@Controller
@Transactional
@RequestMapping(value = "/image")
public class ImageEndpoint {
	/**
	 * Download single file using
	 * 
	 * @throws IOException
	 */
	public static Logger logger = LogManager.getLogger(ImageEndpoint.class);
	
//	private String root_dir = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.WINDOW_IMAGE_ROOT_DIRECTORY");
	private String root_dir = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.IMAGE_ROOT_DIRECTORY");	

	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public void getImage(HttpServletResponse response, HttpServletRequest request) throws IOException {
		
		try {
			String[] path = request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString().split("/");
			path = Arrays.copyOfRange(path, 2, path.length);
			logger.debug(Arrays.toString(path));
			String joined = String.join(File.separator, path);
			logger.debug(joined);
			
			File f = new File(this.root_dir + File.separator + joined);
			BufferedImage bufferedImg = ImageIO.read(f);
			OutputStream out = response.getOutputStream();

			logger.debug(path[path.length - 1]);
			String[] file = path[path.length - 1].split("\\.");
			logger.debug(Arrays.toString(file));
			String ext = file[file.length - 1];
			logger.debug(ext);
			ImageIO.write(bufferedImg, ext, out);
			out.close();
		} catch (Exception e) {
			logger.error(e.getMessage());
			try {
				String[] path = request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString().split("/");
				path = Arrays.copyOfRange(path, 2, path.length - 1);
				String joined = String.join(File.separator, path);
				File f = new File(this.root_dir + File.separator + joined + File.separator + "default.png");
				BufferedImage bufferedImg = ImageIO.read(f);
				OutputStream out = response.getOutputStream();
				ImageIO.write(bufferedImg, "png", out);
				out.close();
			} catch (Exception e2) {
				logger.error(e2.getMessage());
				throw new ResourceNotFoundException();
			}
		}
	}
	

	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public class ResourceNotFoundException extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	}
}