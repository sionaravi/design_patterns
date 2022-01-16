package strategy_design;

/*
 * Sorts items based on a InsertionSort algorithm
 * used this video for code https://youtu.be/4P95xpLjbQ4
 */
import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort implements SortBehavior{

	public ArrayList<String> sort(ArrayList<String> data) {
		
			for (int i = 1; i < data.size(); i++) {
	        String current = data.get(i);
	        int index = i;
	        while (index > 0 && current.compareTo(data.get(index - 1)) < 0){
	        	
	            data.set(index, data.get(index - 1));
	            index--;
	        }
	        data.set(index, current);
	        Collections.sort(data);
	        System.out.println(data);

	      
	    }
		return data;
	}
}

