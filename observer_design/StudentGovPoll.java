package observer_design;

/**
 * Class that creates the S and its observers
 * Siona Ravi
 */

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
	
	private ArrayList<Observer> observers;
	private HashMap<String, Integer> votes;
	private String school;
	private int numUpdates;
	
	public StudentGovPoll(String school) {
		this.school = school;
		observers = new ArrayList<Observer>();
	}
	
	

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		 observers.remove(observer);
	}
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(votes);
		}
		
	}
	
	public void addCandidate(String president) {
		this.votes = votes;
		notifyObservers();
		
		
	}
	
	public void enterVotes(String president, int num) {
		
		
	}
	
	public String getSchool() {
		return this.school;
		
	}

	

	
	
	
	
	

}
