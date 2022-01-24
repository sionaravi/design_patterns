package observer_design;

/**
 *  Displays how many votes each president has, based on the values in the votes HashMap.
 *  @author Siona Ravi
 */

import java.util.HashMap;

public class TallyDisplay implements Observer{

	private Subject poll;
	private HashMap<String, Integer> votes;
	
	/**
     	* This is a constructor for the display, registers the poll
     	*/
	public TallyDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObserver(this);	
	}
	
	/**
	 * Updates by giving new HashMap information
	 */
	public void update(HashMap<String, Integer> votes) {
        display();
	}
	
	/**
	 *  Will display number of presidents and number of votes
	 */
	private void display() {
		
	}
	
}
