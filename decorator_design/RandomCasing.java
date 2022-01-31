package decorator_design;

/**
 * Random casing is going to go through all the characters.
 * @author Siona Ravi
 */

import java.util.*;

public class RandomCasing extends PasswordDecorator {
	
	/**
	 * For each character in the password, 50% of the time it will be in upper case,
	 * and the other 50% it will be in lower.
	 * @return the password 
	 */

	public String getPassword() {
		return this.password;
	}
	
	/**
	 * This will make them uppercase and 50 of the time make them lowercase we've got
	 * @param passwordBeginning
	 */
	public RandomCasing(Password passwordBeginning) {
		super(passwordBeginning);
		
	}
}
