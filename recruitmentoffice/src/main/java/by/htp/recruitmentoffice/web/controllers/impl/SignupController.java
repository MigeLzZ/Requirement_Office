package by.htp.recruitmentoffice.web.controllers.impl;

import static by.htp.recruitmentoffice.web.util.WebConstantDeclaration.*;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.exception.ConstraintViolationException;
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
@RequestMapping(value = "/signup_action")
public class SignupController {

	private static final String MSG_NO_SINGUP_USER = "Can't sign up. Smth that you are write are incorrect!";
	private static final String MSG_USER_DUPLICATE = "User with this login already exists.";

	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String signUp() {
		return PAGE_USER_SIGNUP;
	}

	@RequestMapping(method = RequestMethod.POST)
	private String authorization(@RequestParam Map<String, String> params, HttpSession session, Model model) {
		String login = params.get(REQUEST_PARAM_USER_LOGIN);
		String password = params.get(REQUEST_PARAM_USER_PASSWORD);
		String name = params.get(REQUEST_PARAM_USER_NAME);
		String surname = params.get(REQUEST_PARAM_USER_SURNAME);
		String age = params.get(REQUEST_PARAM_USER_AGE);
		String registration = params.get(REQUEST_PARAM_USER_REGISTRATION);
		String height = params.get(REQUEST_PARAM_USER_HEIGHT);
		String weight = params.get(REQUEST_PARAM_USER_WEIGHT);
		String typeOfBlood = params.get(REQUEST_PARAM_USER_TYPEOFBLOOD);
		String skinDisease = params.get(REQUEST_PARAM_USER_SKINDISEASE);

		try {
			HttpRequestParamValidator.validateRequestParamStringNotNull(login, password, name, surname, age,
					registration, height, weight, typeOfBlood, skinDisease);
			User user = new User(0, login, password, name, surname, age, registration, height, weight, typeOfBlood,
					skinDisease, 1);
			userService.create(user);
			session.setAttribute(REQUEST_PARAM_USER, user);
			return REDIRECT_TO + "/profile_action";
		} catch (ValidateNullParamException e) {
			model.addAttribute(REQUEST_MSG, MSG_NO_SINGUP_USER);
			return PAGE_USER_SIGNUP;
		} catch (ConstraintViolationException e) {
			model.addAttribute(REQUEST_MSG, MSG_USER_DUPLICATE);
			return PAGE_USER_SIGNUP;
		}
	}
}
