package by.htp.recruitmentoffice.web.util;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

public class FormUtil {

	public static String getString(HttpServletRequest req, String field) {
        String value = req.getParameter(field);
		return value;
    }

    public static int getInt(HttpServletRequest req, String field) throws ParseException {
        String value = req.getParameter(field);
        return Integer.parseInt(value);
    }

    public static boolean isPost(HttpServletRequest reg){
        return reg.getMethod().toUpperCase().equals("POST");
    }
}
