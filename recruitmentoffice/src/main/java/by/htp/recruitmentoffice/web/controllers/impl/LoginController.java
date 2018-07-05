package by.htp.recruitmentoffice.web.controllers.impl;

import static by.htp.recruitmentoffice.web.util.WebConstantDeclaration.*;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.recruitmentoffice.domain.User;
import by.htp.recruitmentoffice.service.UserService;
import by.htp.recruitmentoffice.web.util.HttpRequestParamValidator;
import by.htp.recruitmentoffice.web.util.ValidateNullParamException;

@Controller
@RequestMapping(value = "/login_action")
public class LoginController {

	private static final String MSG_NO_USER = "Can't login cause of the incorrect login or password!";
	
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return PAGE_USER_LOGIN;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	private String authorization(@RequestParam Map<String, String> params, HttpSession session, Model model) {
		String login = params.get(REQUEST_PARAM_USER_LOGIN);
		String password = params.get(REQUEST_PARAM_USER_PASSWORD);
		try {
			HttpRequestParamValidator.validateRequestParamStringNotNull(login, password);
			User user = userService.loginRead(login, password);
			HttpRequestParamValidator.validateRequestParamObjectNotNull(user);
			session.setAttribute(REQUEST_PARAM_USER, user);
			return REDIRECT_TO + "/profile_action";
		} catch (ValidateNullParamException e) {
			model.addAttribute(REQUEST_MSG, MSG_NO_USER);
			return PAGE_USER_LOGIN;
		}

	}
	
}
