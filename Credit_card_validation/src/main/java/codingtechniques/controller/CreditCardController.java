package codingtechniques.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import codingtechniques.model.CreditCard;
import jakarta.validation.Valid;

@Controller
public class CreditCardController {

	
	@GetMapping("/registration")
	public String getRegPage(@ModelAttribute("creditCard") CreditCard creditCard) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveCard(@Valid CreditCard creditCard, Errors errors) {
		if (errors.hasErrors()) {
			return "register";
		}
		return "successPage";
	}
}
