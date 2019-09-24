package eg.com.unifonic.assignment.validator;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import eg.com.unifonic.assignment.formbean.UserForm;

@Component
public class UserFormValidator implements Validator{
	  // common-validator library.
    private EmailValidator emailValidator = EmailValidator.getInstance();

	@Override
	public boolean supports(Class<?> aClass) {
		return UserForm.class.equals(aClass);

	}

	@Override
	public void validate(Object target, Errors errors) {
		UserForm userForm = (UserForm) target;
		// Check the fields of UserForm.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty.userForm.firstName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty.userForm.lastName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "NotEmpty.userForm.phoneNumber");



	}

}
