package observer_design;

/**
* Interface for the Student Government Poll
* Siona Ravi
*/

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();

}
