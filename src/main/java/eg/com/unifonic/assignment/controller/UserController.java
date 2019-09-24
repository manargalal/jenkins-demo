package eg.com.unifonic.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import eg.com.unifonic.assignment.formbean.UserForm;
import eg.com.unifonic.assignment.validator.UserFormValidator;

@Controller
public class UserController {
	private Boolean disabled = true;
	@Autowired
	private UserFormValidator appUserValidator;


	@InitBinder
	protected void initBinder(WebDataBinder dataBinder) {
		// Form target
		Object target = dataBinder.getTarget();
		if (target == null) {
			return;
		}
		System.out.println("Target=" + target);

		if (target.getClass() == UserForm.class) {
			dataBinder.setValidator(appUserValidator);
		}


	}


	// Show Register page.
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewRegister(Model model) {
		UserForm form = new UserForm();
		model.addAttribute("userForm", form);
		return "registrationFormPage";
	}

	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveRegister(Model model, @ModelAttribute("userForm") @Validated UserForm userForm, BindingResult result,final RedirectAttributes redirectAttributes) {

		return "registrationFormPage";
	}
}
