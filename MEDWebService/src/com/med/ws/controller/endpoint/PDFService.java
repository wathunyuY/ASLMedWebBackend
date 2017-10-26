package com.med.ws.controller.endpoint;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.med.asl.ws.beans.ResearchBean;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.ResearchTblDAO;
import com.med.ws.controller.service.ResearchService;
import com.med.ws.dto.response.MasterResponse;

@Controller
@Transactional
@RequestMapping(value = "/pdf")
public class PDFService {
	@Autowired
	ResearchService researchService;	
	@Autowired
	ResearchTblDAO researchTblDAO;
	public static Logger logger = LogManager.getLogger(PDFService.class);
	public static String image_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.RESEARCH_IMAGE_DIRECTORY");//research/pivtures
	public static String pdf_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.RESEARCH_PDF_DIRECTORY");//research/genpdf
	public static String root_image_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY");//image
	public static String root_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.IMAGE_ROOT_DIRECTORY"); //var/www/res..
	public static String slash = Constants.SYMBOLIC.SLASH;
	public static String front = root_path + slash + pdf_path + slash + "font/THSarabunNew.ttf";//angsa
	 @RequestMapping(value="/getpdf", method=RequestMethod.GET)
	    public @ResponseBody MasterResponse getpdf(@RequestParam("research") Integer research, HttpServletRequest request,HttpServletResponse response) throws IOException, DocumentException, MEDException {
		    Date now = Calendar.getInstance().getTime();
		 	ResearchBean rs = researchService.getResearch(research);
		 	String DEST = root_path +slash+pdf_path+slash+rs.getResearchName()+now.getTime()+"_1.pdf";
		 	File file = new File(DEST);
	        file.getParentFile().mkdirs();
	        new PDFService().createPdf2(DEST,rs);
	        FileInputStream in = new FileInputStream(file);
			byte[] content = new byte[(int) file.length()];
			in.read(content);
			ServletContext sc = request.getSession().getServletContext();
			String mimetype = sc.getMimeType(file.getName());
			response.reset();
			response.setContentType(mimetype);
			response.setContentLength(content.length);
			response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");logger.info(file.getName());
			org.springframework.util.FileCopyUtils.copy(content, response.getOutputStream());
			in.close();
			file = new File(DEST);
			file.delete();
            file.exists();
            file.deleteOnExit();
			return null;
	    }
		public void createPdf2(String dest,ResearchBean d) throws IOException, DocumentException {
			Document document = new Document();
			StringBuilder sb = new StringBuilder();
	        sb.append("<br/><br/>");
	        if(null != d.getResearchHeader()){
	        	sb.append(java.net.URLDecoder.decode(d.getResearchHeader(),"UTF-8"));
	        	sb.append("<br/><br/>");
	        }
	        if(null != d.getResearchDescr())
	        	sb.append(java.net.URLDecoder.decode(d.getResearchDescr(),"UTF-8"));
	        
	        float scaler = ((document.getPageSize().getWidth() - document.leftMargin() - document.rightMargin() - 0) );
	        String image = root_path+slash + d.getResearchPicture().substring("image/".length(),d.getResearchPicture().length())+"_300.png";
	        OutputStreamWriter fWriter = null;
	        BufferedWriter writers = null;
	        try {
	        	fWriter = new OutputStreamWriter(new FileOutputStream(root_path +slash+pdf_path+slash+"template.html"), StandardCharsets.UTF_8);
	            writers = new BufferedWriter(fWriter);
	            writers.write("<html>");writers.newLine();
	            writers.write("<head>");writers.newLine();
	            writers.write("<meta http-equiv=\"content-type\" content=\"application/xhtml+xml; charset=UTF-8\"/>");writers.newLine();
	            writers.write("</head>");writers.newLine();
	            writers.write("<body style=\"font-family: THSarabunNew; font-size:20px; \" > ");writers.newLine();
	            
	            writers.write("<h2>"+d.getResearchName()+( null != d.getResearchSymbol() ?  " ( "+ d.getResearchSymbol() +" )" : "")+"</h2>");writers.newLine();
	            writers.write("<span style=\"font-size:16px; color:gray;  \">" +"Analyst :" + (null != d.getResearchAuthor() ? d.getResearchAuthor() : "-") + "</span>");
	            writers.write(sb.toString());writers.newLine();
	            if(null != d.getResearchPicture()){
	            	writers.write("<div align=\"center\"><br/><br/>");
	            	writers.write("<img src=\""+image+"\"  style=\"width: "+scaler+";height: auto;\"> </img>");
	            	writers.write("</div>");
	            }
	            
	            writers.write("</body>");writers.newLine();
	            writers.write("</html>");writers.newLine();
	            writers.newLine(); //this is not actually needed for html files - can make your code more readable though 
	            writers.close(); //make sure you close the writer object 
	        } catch (Exception e) {
	          //catch any exceptions here
	        }
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
	        document.open();
	        XMLWorkerFontProvider fontImp = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
	        fontImp.register(front);
	        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
	                new FileInputStream(root_path +slash+pdf_path+slash+"template.html"), null, Charset.forName("UTF-8"), fontImp);
	        document.close();
	    }
}
