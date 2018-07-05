package by.htp.recruitmentoffice.web.controllers.impl;

import static by.htp.recruitmentoffice.web.util.WebConstantDeclaration.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.htp.recruitmentoffice.domain.User;
import by.htp.recruitmentoffice.service.UserService;
import by.htp.recruitmentoffice.web.util.FormUtil;

@Controller
@RequestMapping(value = "/profile_action")
public class ProfileController {

	private static final String MSG_PROFILE_UPDATED = "Profile updated!";
	
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewProfile(HttpServletRequest request, HttpSession session) {
		session = request.getSession();
		Object obj = session.getAttribute("user");
		if (obj == null) {
			return REDIRECT_TO + "/main_action";
		} else
			return PAGE_USER_PROFILE;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String profile(HttpServletRequest request, HttpSession session) {
		session = request.getSession();
		Object obj = session.getAttribute("user");
		User user = (User) obj;
		String login = FormUtil.getString(request, REQUEST_PARAM_USER_LOGIN);
		String password = FormUtil.getString(request, REQUEST_PARAM_USER_PASSWORD);
		String registration = FormUtil.getString(request, REQUEST_PARAM_USER_REGISTRATION);
		String height = FormUtil.getString(request, REQUEST_PARAM_USER_HEIGHT);
		String weight = FormUtil.getString(request, REQUEST_PARAM_USER_WEIGHT);
		String skinDisease = FormUtil.getString(request, REQUEST_PARAM_USER_SKINDISEASE);
		user.setLogin(login);
		user.setPassword(password);
		user.setRegistration(registration);
		user.setHeight(height);
		user.setWeight(weight);
		user.setSkin_desease(skinDisease);
		userService.update(user);
		request.setAttribute(REQUEST_MSG_SUCCESS, MSG_PROFILE_UPDATED);
		return PAGE_USER_PROFILE;
	}
	
}
