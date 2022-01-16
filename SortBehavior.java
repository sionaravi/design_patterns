package strategy_design;

import java.util.ArrayList;

public interface SortBehavior {
	
	/*
	 * Each child implements the interface, and will appropriately
	 * sort the data
	 */
	public ArrayList<String> sort(ArrayList<String> data);
}

