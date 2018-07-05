package by.htp.recruitmentoffice.web.controllers.impl;

import static by.htp.recruitmentoffice.web.util.WebConstantDeclaration.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.recruitmentoffice.domain.Doctor;
import by.htp.recruitmentoffice.domain.Schedule;
import by.htp.recruitmentoffice.domain.User;
import by.htp.recruitmentoffice.service.DoctorService;
import by.htp.recruitmentoffice.service.ScheduleService;
import by.htp.recruitmentoffice.web.util.FormUtil;

@Controller
@RequestMapping(value = "/appointment_action")
public class MakeAppointmentController {
	
	private static final String MSG_USER_RECORDED = "You have a record!";
	
	@Autowired
	private ScheduleService scheduleService;
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewRecords(Model model) {
		List<Schedule> schedules = scheduleService.getSchedulesList();
		List<Doctor> doctors = doctorService.getDoctorsList();
		model.addAttribute(REQUEST_PARAM_SCHEDULE_LIST, schedules);
		model.addAttribute(REQUEST_PARAM_DOCTOR_LIST, doctors);
		return PAGE_USER_MAKE_RECORDS;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String makeRecords(@RequestParam Map<String, String> params, HttpSession session, HttpServletRequest request, Model model) throws ParseException {
		session = request.getSession();
		Object obj = session.getAttribute("user");
		User user = (User) obj;
		int id = FormUtil.getInt(request, REQUEST_PARAM_SCHEDULE_ID);
		//int id1 = FormUtil.getInt(request, REQUEST_PARAM_DOCTOR_ID);
		String date = FormUtil.getString(request, REQUEST_PARAM_SCHEDULE_DATE);
		String timeSlot = FormUtil.getString(request, REQUEST_PARAM_SCHEDULE_TIMESLOT);
		//int usersId = FormUtil.getInt(request, REQUEST_PARAM_SCHEDULE_USER_ID);
		int doctorsId = FormUtil.getInt(request, REQUEST_PARAM_SCHEDULE_DOCTORS_ID);
		String name = FormUtil.getString(request, REQUEST_PARAM_DOCTOR_NAME);
		List<Schedule> schedules = scheduleService.getSchedulesList();
		model.addAttribute(REQUEST_PARAM_SCHEDULE_LIST, schedules);
		List<Doctor> doctors = doctorService.getDoctorsList();
		model.addAttribute(REQUEST_PARAM_DOCTOR_LIST, doctors);
		Schedule schedule = new Schedule(id, date, timeSlot, user.getId(), doctorsId);
		//Doctor doctor = new Doctor(id1, name, null, null, null);
		if (request.getParameter("Record") != null) {
			scheduleService.record(schedule);
			request.setAttribute(REQUEST_MSG_SUCCESS, "User " + schedule.getDate() + " " + schedule.getTime_slot() + MSG_USER_RECORDED);
			return PAGE_USER_MAKE_RECORDS;
		}
		return null;
	}
}
