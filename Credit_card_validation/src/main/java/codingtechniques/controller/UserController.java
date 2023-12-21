package codingtechniques.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import codingtechniques.model.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	
	@GetMapping("/registration")
	public String getRegPage(@ModelAttribute("user") User user) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(@Valid User user, Errors errors) {
		if (errors.hasErrors()) {
			return "register";
		}
		return "successPage";
	}
}
