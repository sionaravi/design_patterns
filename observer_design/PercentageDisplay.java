package observer_design;

/**
 *  Displays the percent of votes each president has, based on the values in the votes HashMap.
 *  Siona Ravi
 */

import java.util.HashMap;

public class PercentageDisplay implements Observer{
	
	private Subject poll;
	
	private HashMap<String, Integer> votes;
	
	private int numVotes;
	
	public PercentageDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObserver(this);
		display();
		
	}
	
	public void update( HashMap<String, Integer> votes) {
		
		display();
		
	}
	
	
	private void display() {
		
		
	}
	
}
	


