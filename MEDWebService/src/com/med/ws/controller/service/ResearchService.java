package com.med.ws.controller.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.med.asl.ws.bean.ResearchBean;
import com.med.asl.ws.bean.ResearchCategoryBean;
import com.med.asl.ws.bean.ResearchFilterBean;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.criteria.bean.ResearchSearchRqType;
import com.med.ods.dao.ResearchCategoryTblDAO;
import com.med.ods.dao.ResearchTblDAO;
import com.med.ods.entity.ResearchCategoryTbl;
import com.med.ods.entity.ResearchTbl;

@Service
@Transactional
public class ResearchService {
	private static Logger logger = LogManager.getLogger(ResearchService.class);

	@Autowired
	ResearchCategoryTblDAO categoryTblDAO;
	@Autowired
	ResearchTblDAO researchTblDAO;
	@Autowired
	ImageService imageService;
	@Autowired
	ASLService aslSerive;
	/**
	 * Get research category
	 * @return 
	 */
	public List<ResearchCategoryBean> getCategory(){
		List<ResearchCategoryBean> rs = new ArrayList<>();
		try{
			
			List<ResearchCategoryTbl> categorys = (List<ResearchCategoryTbl>) categoryTblDAO.findAll();
			if(!CollectionUtils.isEmpty(categorys)){
				for(ResearchCategoryTbl c : categorys){
					ResearchCategoryBean b = new ResearchCategoryBean();
					b.setCategoryId(c.getCategoryId());
					b.setCategoryName(c.getCategoryName());
					b.setCategoryNameEn(c.getCategoryNameEn());
					rs.add(b);
				}
			}
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
		}
		return rs;
	}
	public ResearchCategoryBean getCategoryBean(ResearchCategoryTbl c){
		ResearchCategoryBean b = new ResearchCategoryBean();
		try{
			b.setCategoryId(c.getCategoryId());
			b.setCategoryName(c.getCategoryName());
			b.setCategoryNameEn(c.getCategoryNameEn());
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex); 
		}
		return b;
	}
	
	/**
	 * create research category
	 * @return 
	 * @throws MEDException 
	 */
	public void createCategory(ResearchCategoryBean rq) throws MEDException{
		try{
			ResearchCategoryTbl c = new ResearchCategoryTbl();
			if(null != rq.getCategoryId())
				c = categoryTblDAO.findByPK(rq.getCategoryId());
			c.setCategoryName(rq.getCategoryName());
			c.setCategoryNameEn(rq.getCategoryNameEn());
			categoryTblDAO.merge(c);
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);

		}
	}
	
	/**
	 * delete research category
	 * @throws MEDException 
	 */
	public void deleteCategory(Integer id) throws MEDException{
		try{
			ResearchCategoryTbl c = categoryTblDAO.findByPK(id);
			categoryTblDAO.delete(c);
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);

		}
	}

	/**
	 * Create Research 
	 * @throws MEDException 
	 */
	public void createResearch(ResearchBean rq,Integer oprid) throws MEDException{
		try{
			Date now = Calendar.getInstance().getTime();
			ResearchTbl tbl = new ResearchTbl();
			if(null != rq.getResearchId())
				tbl = researchTblDAO.findByPK(rq.getResearchId());
			tbl.setLastUpdDttm(now);
			tbl.setLastUpdOprid(oprid);
			tbl.setResearchAuthor(rq.getResearchAuthor());
			tbl.setResearchCategoryTbl(categoryTblDAO.findByPK(rq.getCategoryId()));
			if(null == tbl.getResearchCreateDate())
				tbl.setResearchCreateDate(now);
			
			ObjectMapper mapper = new ObjectMapper();
			byte[] descr = mapper.writeValueAsBytes(rq.getResearchDescr());
			byte[] header = mapper.writeValueAsBytes(rq.getResearchHeader());
			tbl.setResearchDescr(descr);
			tbl.setResearchHeader(header);
			tbl.setResearchName(rq.getResearchName());
			tbl.setResearchSybol(rq.getResearchSymbol());
			tbl = researchTblDAO.merge(tbl);
			if(null != rq.getResearchPicture())
				tbl.setResearchPicture(this.uploadResearchPic(rq.getResearchPicture(),tbl.getResearchId(), now, oprid));
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		
	}
	private String uploadResearchPic(String base64,Integer researchId,Date now,Integer oprid) throws IOException{
		String path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.RESEARCH_IMAGE_DIRECTORY");
		String name = "rsp_"+oprid+"_"+researchId+"_"+now.getTime();
		imageService.convertBase64ToFile(base64, path, name);
		return name;
	}
	
	/**
	 * Get research by id
	 * @throws MEDException 
	 */
	public ResearchBean getResearch(Integer id) throws MEDException{
		String path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.RESEARCH_IMAGE_DIRECTORY");
		String root_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY");
		ResearchBean rs = new ResearchBean();	
		try{
			ResearchTbl tbl = researchTblDAO.findByPK(id);
			rs.setResearchId(tbl.getResearchId());
			rs.setCategory(this.getCategoryBean(tbl.getResearchCategoryTbl()));
			rs.setResearchAuthor(tbl.getResearchAuthor());
			rs.setResearchCreateDate(tbl.getResearchCreateDate());
			
			ObjectMapper mapper = new ObjectMapper();
			String header = mapper.readValue(tbl.getResearchHeader(), String.class);
			String descr = mapper.readValue(tbl.getResearchDescr(),String.class);
			rs.setResearchHeader(header);
			rs.setResearchDescr(descr);
			rs.setResearchName(tbl.getResearchName());
			rs.setResearchSymbol(tbl.getResearchSybol());
			if(null != tbl.getResearchPicture() && !(Constants.SYMBOLIC.STRINGEMPTY.equals(tbl.getResearchPicture())))
				rs.setResearchPicture(root_path+Constants.SYMBOLIC.SLASH+path + Constants.SYMBOLIC.SLASH + tbl.getResearchPicture());//
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS,"researchId : " + id);
		}
		return rs;
	}
	
	/**
	 * Delete research
	 * @throws MEDException 
	 */
	public void deleteResearch(Integer id) throws MEDException{
		try{
			ResearchTbl c = researchTblDAO.findByPK(id);
			researchTblDAO.delete(c);
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);

		}
	}
	
	/**
	 * Get RESEARCH_AUTHOR
	 */
	public ResearchFilterBean getResearchFilter(){
		ResearchFilterBean rs = new ResearchFilterBean();
		try{
			rs.setAuthor(researchTblDAO.findDistinctField("researchAuthor"));
			rs.setSymbol(researchTblDAO.findDistinctField("researchSybol"));
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
		}
		return rs;
	}
	
	/**
	 * Find research
	 * @throws MEDException 
	 */
	public List<ResearchBean> findResearch(ResearchSearchRqType rq) throws MEDException{
		List<ResearchBean> res = new ArrayList<>();
		try{
			List<ResearchTbl> tbls = researchTblDAO.search(rq);
			if(!CollectionUtils.isEmpty(tbls)){
				for(ResearchTbl tbl : tbls){
					ResearchBean rs = new ResearchBean();
					rs.setResearchId(tbl.getResearchId());
					rs.setCategory(this.getCategoryBean(tbl.getResearchCategoryTbl()));
					rs.setResearchAuthor(tbl.getResearchAuthor());
					rs.setResearchCreateDate(tbl.getResearchCreateDate());
					rs.setResearchName(tbl.getResearchName());
					rs.setResearchSymbol(tbl.getResearchSybol());
					res.add(rs);
				}
			}
		}catch(Exception ex){
			logger.debug(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		return res;
	}
	
	
}
