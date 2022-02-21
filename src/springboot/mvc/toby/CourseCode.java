package springboot.mvc.toby;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	public String value() default "OUHK";
	public String message() default "You must start with OUHK";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
