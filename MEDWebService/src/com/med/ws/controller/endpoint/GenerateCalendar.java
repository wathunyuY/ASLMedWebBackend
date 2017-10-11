package com.med.ws.controller.endpoint;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.med.ws.controller.service.CalendarService;
import com.med.ws.dto.response.MasterResponse;

import net.fortuna.ical4j.data.CalendarOutputter;
import net.fortuna.ical4j.model.ValidationException;

@Controller
@Transactional
@RequestMapping(value = "/calendar")
public class GenerateCalendar {

	@Autowired
	CalendarService calendarService;
	
	@RequestMapping(value = "/googleGenerate", method = RequestMethod.GET)
	public @ResponseBody MasterResponse download(@RequestParam("user") String user, HttpServletRequest request, HttpServletResponse response) throws ValidationException, Exception {
		FileOutputStream fout = new FileOutputStream("mycalendar.ics");
		CalendarOutputter outputter = new CalendarOutputter();
//		outputter.output(calendarService.genCalendar(), fout);
		fout.close();
		return null;
	}
}
