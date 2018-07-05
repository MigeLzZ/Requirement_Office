package by.htp.recruitmentoffice.web.controllers.impl;

import static by.htp.recruitmentoffice.web.util.WebConstantDeclaration.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.recruitmentoffice.domain.Doctor;
import by.htp.recruitmentoffice.domain.Schedule;
import by.htp.recruitmentoffice.service.DoctorService;
import by.htp.recruitmentoffice.service.ScheduleService;

@Controller
@RequestMapping(value = "/")
public class MainController {

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private ScheduleService scheduleService;

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	public void setScheduleService(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	
	@RequestMapping(value = "/main_action", method = RequestMethod.GET)
	public String mainAction(HttpServletRequest request, ModelMap model) {
		// TODO
		List<Doctor> doctors = doctorService.getDoctorsList();
		List<Schedule> schedules = scheduleService.getSchedulesList();
		model.addAttribute(REQUEST_PARAM_SCHEDULE_LIST, schedules);
		model.addAttribute(REQUEST_PARAM_DOCTOR_LIST, doctors);
		return PAGE_USER_MAIN;		
	}
}
