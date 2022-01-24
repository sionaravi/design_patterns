package observer_design;

/**
 * Class that creates the S and its observers
 * @author Siona Ravi
 */

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
	
	private ArrayList<Observer> observers;
	private HashMap<String, Integer> votes;
	private String school;
	private int numUpdates;
	
	/**
     	* Conducts a poll for the school
     	*/
	public StudentGovPoll(String school) {
		this.school = school;
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * Registers the observer in the list.
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 *  Removes the observer in the list.
	 */
	@Override
	public void removeObserver(Observer observer) {
		 observers.remove(observer);
	}
	
	/**
	 * Notifies the observer in the list.
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(votes);
	}
	
	/**
    	 * Takes the president names
     	*/
	public void addCandidate(String president) {
		
	}
	
	/**
    	 * Takes the votes and then calls to notify the obeservers
    	 */
	public void enterVotes(String president, int num) {
		this.votes = votes;
		notifyObservers();
	}
	
	/**
	 *  Returns the name of the school
	 */
	public String getSchool() {
		return this.school;
		
	}

}
