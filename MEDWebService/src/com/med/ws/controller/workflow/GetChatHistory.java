package com.med.ws.controller.workflow;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.common.utils.DateUtils;
import com.med.ws.beans.ChatMsgBean;
import com.med.ws.controller.service.BroadcastService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service
public class GetChatHistory extends AbstractWorkflowController {

	@Autowired
	BroadcastService service;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		ResponseBody body = new ResponseBody();
		Integer roomId = Integer.parseInt(processBean.getPathVariable());
//		Integer oprid = Integer.parseInt(processBean.getOprid()); FIXME
		List<ChatMsgBean> rs = service.findHistoryChat(roomId,null, 1);
		body.setChatMsgListRsType(rs);
		return body;
	}

}
