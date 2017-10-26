package com.med.ws.controller.workflow;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.asl.ws.beans.ChatMsgBean;
import com.med.ws.controller.service.TalkService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service
public class GetChatHistory extends AbstractWorkflowController {

	@Autowired
	TalkService service;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		ResponseBody body = new ResponseBody();
		Date lastMassageDate = null;
		if(null != processBean.getParams().getDate())
			lastMassageDate = new Date(Long.parseLong(processBean.getParams().getDate()));
		Integer roomId = Integer.parseInt(processBean.getPathVariable());
		Integer oprid = Integer.parseInt(processBean.getOprid());
		List<ChatMsgBean> rs = service.findHistoryChat(roomId,lastMassageDate, oprid);
		body.setChatMsgListRsType(rs);
		return body;
	}

}
