package by.htp.recruitmentoffice.web.controllers.impl;

import static by.htp.recruitmentoffice.web.util.WebConstantDeclaration.*;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.recruitmentoffice.domain.Doctor;
import by.htp.recruitmentoffice.service.DoctorService;
import by.htp.recruitmentoffice.web.util.FormUtil;

@Controller
@RequestMapping(value = "/redact_doctors_action")
public class RedactDoctorsController {

	private static final String MSG_DOCTOR_UPDATED = "Updated!";
	private static final String MSG_DOCTOR_DELETED = "Deleted!";
	
	@Autowired
	private DoctorService doctorService;

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewUsers(Model model) {
		List<Doctor> doctors = doctorService.getDoctorsList();
		model.addAttribute(REQUEST_PARAM_DOCTOR_LIST, doctors);
		return PAGE_ADMIN_REDACT_DOCTORS;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String redactDoctors(HttpServletRequest request, HttpSession session, Model model) throws ParseException {
		int id = FormUtil.getInt(request, REQUEST_PARAM_DOCTOR_ID);
		String name = FormUtil.getString(request, REQUEST_PARAM_DOCTOR_NAME);
		String surname = FormUtil.getString(request, REQUEST_PARAM_DOCTOR_SURNAME);
		String spec = FormUtil.getString(request, REQUEST_PARAM_DOCTOR_SPEC);
		String receiptTime = FormUtil.getString(request, REQUEST_PARAM_DOCTOR_RECEIPTTIME);
		List<Doctor> doctors = doctorService.getDoctorsList();
		model.addAttribute(REQUEST_PARAM_DOCTOR_LIST, doctors);
		Doctor doctor = new Doctor(id, name, surname, spec, receiptTime);
		if (request.getParameter("UpdateD") != null) {
			doctorService.update(doctor);
			request.setAttribute(REQUEST_MSG_SUCCESS, "Doctor " + doctor.getName() + MSG_DOCTOR_UPDATED);
			return PAGE_ADMIN_REDACT_DOCTORS;
		} else if (request.getParameter("DeleteD") != null) {
			doctorService.delete(doctor);
			request.setAttribute(REQUEST_MSG, "Doctor " + doctor.getName() + MSG_DOCTOR_DELETED);
			return PAGE_ADMIN_REDACT_DOCTORS;
		}
		return null;
	}
}
