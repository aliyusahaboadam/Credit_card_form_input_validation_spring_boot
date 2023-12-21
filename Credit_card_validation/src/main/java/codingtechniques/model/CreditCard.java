package codingtechniques.model;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;

public class CreditCard {
	
	@CreditCardNumber(message = "Not a Valid Credit Card")
	private String creditCardNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Must match the MM/YY")
	private String creditCardExpiration;
	
	@Digits(integer = 3, fraction = 0, message = "Invalid CVV")
	private String creditCardCVV;
	
	public CreditCard() {}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardExpiration() {
		return creditCardExpiration;
	}

	public void setCreditCardExpiration(String creditCardExpiration) {
		this.creditCardExpiration = creditCardExpiration;
	}

	public String getCreditCardCVV() {
		return creditCardCVV;
	}

	public void setCreditCardCVV(String creditCardCVV) {
		this.creditCardCVV = creditCardCVV;
	}
	
	
	
	
	

}
