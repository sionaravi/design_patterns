package strategy_design;

	import java.util.ArrayList;
	import java.util.Collections;

	/*
	 *  
	 * used this video for code https://youtu.be/467BD-yuvmk
	 */
	public class BubbleSort implements SortBehavior {
		
		public ArrayList<String> sort(ArrayList<String> data) {
			
			/*for (int j = 0; j < data.size() - 1; j++ ) {
				
				for (int i = 0; i < data.size()-1; i++) {
					
					if (data.get(i).compareTo(data.get(i+1)) > 0) {
						
						String temp = data.get(i);
						data.set(i, data.get(i+1));
						data.set(i+1, temp); */
						Collections.sort(data);
				        System.out.println(data);
					
				
			
			return data;
		}
	}


