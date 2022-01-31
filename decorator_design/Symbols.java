package decorator_design;

/**
 * Symbols extends PasswordDecorator and and adds symbols to the password.
 * @author Siona Ravi
 */

import java.util.*;

public class Symbols extends PasswordDecorator {
	
	/**
	 * Adds symbols to the password based on the following conversion.
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * Uses random symbols to make the password stronger.
	 * @param passwordBeginning
	 */
	public Symbols(Password passwordBeginning) {
		super(passwordBeginning);
        this.password = passwordBeginning.getPassword();
		
	}
}
