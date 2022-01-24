package observer_design;

/**
 *  Displays the percent of votes each president has, based on the values in the votes HashMap.
 *  @author Siona Ravi
 */

import java.util.HashMap;

public class PercentageDisplay implements Observer{
	
	private Subject poll;
	
	private HashMap<String, Integer> votes;
	
	private int numVotes;
	
	/**
	 * Creates a display object for the percentage
	 */
	public PercentageDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObserver(this);
		display();	
	}
	
	/**
	 *  Updates by giving new HashMap information
	 */
	public void update( HashMap<String, Integer> votes) {
		display();
	}
	
	/**
	 *  Will display the percentage of votes for each candidate
	 */
	private void display() {
		
	}	
}
