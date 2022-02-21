package springboot.mvc.toby;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>{
	private String prefix;
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(arg0.startsWith(this.prefix)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		this.prefix = constraintAnnotation.value();
	}

}
