package iterator_design;

/**
 * This holds the details of an exercise
 * @author Siona Ravi
 */

import java.util.*;

public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;
    
    /**
     * Details of exercise
     * @param title
     * @param targetMuscles
     * @param directions
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * A void methods for muscle
     * @param muscle
     */
    public void addTargetMuscles(String muscle) {
       
    }
    
    /**
     * A void methods for muscle
     * @param muscle
     */
    public void removeTargetMuscle(String muscle) {

    }
    
    /**
     * Returns a string representation of title, targeted muscles and directions
     */
    public String toString() {
        
    	return ("\n... " + this.title + " ...\n" + "\nMuscles: " + this.targetMuscles+ "\nExercises: \n" + "-" + this.directions + "\n");
    }

    
}
 
