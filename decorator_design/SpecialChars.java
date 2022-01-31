package decorator_design;

/**
 * SpecialChars extends PasswordDecorator and and adds special characters.
 * @author Siona Ravi
 */
import java.util.*;

public class SpecialChars extends PasswordDecorator {
	
	
	/**
	 * Loop through the characters in the password, 30% of the time, 
	 * add a random special character after the letter.
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * Has a bunch of special characters
	 * @param passwordBeginning
	 */
	public SpecialChars(Password passwordBeginning) {
		super(passwordBeginning);
		this.password = passwordBeginning.getPassword();
		
		ArrayList<String> arrChars = new ArrayList<String>();
		arrChars.add("*");
		arrChars.add("!");
		arrChars.add("%");
		arrChars.add("+");
		arrChars.add(".");
		arrChars.add("{");
		arrChars.add("}");
		
	}
}
