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

import by.htp.recruitmentoffice.domain.User;
import by.htp.recruitmentoffice.service.UserService;
import by.htp.recruitmentoffice.web.util.FormUtil;

@Controller
@RequestMapping(value = "/redact_users_action")
public class RedactUsersController {

	private static final String MSG_USER_UPDATED = "Updated!";
	private static final String MSG_USER_DELETED = "Deleted!";
	
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewUsers(Model model) {
		List<User> users = userService.getUsersList();
		model.addAttribute(REQUEST_PARAM_USER_LIST, users);
		return PAGE_ADMIN_REDACT_USERS;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String redactUsers(HttpServletRequest request, HttpSession session, Model model) throws ParseException {
		int id = FormUtil.getInt(request, REQUEST_PARAM_USER_ID);
		String login = FormUtil.getString(request, REQUEST_PARAM_USER_LOGIN);
		String password = FormUtil.getString(request, REQUEST_PARAM_USER_PASSWORD);
		String name = FormUtil.getString(request, REQUEST_PARAM_USER_NAME);
		String surname = FormUtil.getString(request, REQUEST_PARAM_USER_SURNAME);
		String age = FormUtil.getString(request, REQUEST_PARAM_USER_AGE);
		String registration = FormUtil.getString(request, REQUEST_PARAM_USER_REGISTRATION);
		String height = FormUtil.getString(request, REQUEST_PARAM_USER_HEIGHT);
		String weight = FormUtil.getString(request, REQUEST_PARAM_USER_WEIGHT);
		String typeOfBlood = FormUtil.getString(request, REQUEST_PARAM_USER_TYPEOFBLOOD);
		String skinDisease = FormUtil.getString(request, REQUEST_PARAM_USER_SKINDISEASE);
		int roles_id = FormUtil.getInt(request, REQUEST_PARAM_USER_ROLES_ID);
		List<User> users = userService.getUsersList();
		model.addAttribute(REQUEST_PARAM_USER_LIST, users);
		User user = new User(id, login, password, name, surname, age, registration, height, weight, typeOfBlood, skinDisease, roles_id);
		if (request.getParameter("Update") != null) {
			userService.update(user);
			request.setAttribute(REQUEST_MSG_SUCCESS, "User " + user.getLogin() + MSG_USER_UPDATED);
			return PAGE_ADMIN_REDACT_USERS;
		} else if (request.getParameter("Delete") != null) {
			userService.delete(user);
			request.setAttribute(REQUEST_MSG, "User " + user.getLogin() + MSG_USER_DELETED);
			return PAGE_ADMIN_REDACT_USERS;
		}
		return null;
	}
}
