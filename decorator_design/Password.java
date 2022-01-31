package decorator_design;

/**
 * This is an abstract class that contains a password string.
 * @author Siona Ravi
 */

public abstract class Password {
	
	/**
	 * @return the password
	 */
    public String getPassword() {
        return password;
    }
	
	protected String password;
}