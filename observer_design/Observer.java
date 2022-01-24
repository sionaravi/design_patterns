package observer_design;

/**
* Interface for the Student Government Poll
* @author Siona Ravi
*/

import java.util.HashMap;

public interface Observer {
	
	public void update(HashMap<String, Integer> votes);
	

}
