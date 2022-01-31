package decorator_design;

/**
 * Easy password is to construct it pass in a phrase.
 * @author Siona Ravi
 */

import java.util.*;

public class EasyPassword extends Password{
	
	/**
	 * This returns a password that is built upon the phrase.
	 * @return the password
	 */
	public String getPassword() {
    	return this.password;
    }
	
	/**
	 * To initiaize this class you pass in a phrase.
	 */
    public EasyPassword(String phrase) {
    	this.password = phrase;
        this.password = this.password.replaceAll("\\s","");
        Random num = new Random();
        int passNum = num.nextInt(100);
        String easy = Integer.toString(passNum);
        this.password = this.password + easy;
    }

}