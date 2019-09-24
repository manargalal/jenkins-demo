package eg.com.unifonic.assignment.formbean;

import eg.com.unifonic.assignment.domain.model.Users;
import lombok.Data;

@Data
public class UserForm {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String code;

}
