package by.htp.recruitmentoffice.web.util;

public class ValidateNullParamException extends RuntimeException {

	private static final long serialVersionUID = -6680057542565331428L;

	public ValidateNullParamException() {
		super();
	}

	public ValidateNullParamException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidateNullParamException(String message) {
		super(message);
		
	}

	public ValidateNullParamException(Throwable cause) {
		super(cause);
	}
	
	

}
