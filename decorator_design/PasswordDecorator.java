package decorator_design;

/**
 * An abstract base class, which holds a Password, 
 * and has a method for getPassword.
 * @author Siona Ravi
 */

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;
    
    /**
     * Creates an abstract String for the password
     * @return String of Password
     */
    public abstract String getPassword();

    /**
     * Decorates the password with characters, symbols and casings
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.password = super.password;

    }

}
