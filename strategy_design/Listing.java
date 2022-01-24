package strategy_design;

import java.util.ArrayList;

public class Listing {

	private String title;
	private ArrayList<String> items;
	private SortBehavior sortBehavior;
	
	public Listing (String title) {
		this.title = title;
		this.items = new ArrayList<>();
		this.sortBehavior = new BubbleSort();
	}
	
	public void add (String item) {

		items.add(item);
	}
	
	public void remove (String item) {
		
		items.remove(item);
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public void setSortBehavior (SortBehavior sortBehavior) {
		
		this.sortBehavior = sortBehavior;
	}
	
	public ArrayList<String> getSortedList() {
		
		return items;
	}
	
	public ArrayList<String> getUnSortedList() {
		
		return items;
	}

}

