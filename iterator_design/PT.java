package iterator_design;

/**
 * This is a physical therapy bio
 * @author Siona Ravi
 */

import java.util.*;

public class PT {

    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;
    
    /**
     * PT constructor setting firstName, lastName and bio
     * and creating the excercises
     * @param firstName
     * @param lastName
     * @param bio
     */
    public PT(String firstName,String lastName, String bio) {
    	
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.bio = bio;
    	this.numExercises = 0;
    	this.exercises = new Exercise[2];
    }

    /**
     * This method adds title, muscleGroups and directions
     * @param title
     * @param muscleGroups
     * @param directions
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
    	
    	if (this.numExercises >= this.exercises.length - 1) {
            this.exercises = growArray(exercises);
        }
        exercises[numExercises] = new Exercise(title, muscleGroups, directions);
        numExercises++;
    }
    
    /**
     * Returns first name
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns last name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns bio
     * @return
     */
    public String getBio() {
        return bio;
    }
    
    /**
     * Returns an array of twice the size with the same data
     * @param exercises
     * @return
     */
    public Exercise[] growArray(Exercise[] exercises) {
    	
    	int num = (exercises.length) * 2;
        Exercise[] exercise_1 = new Exercise[num];

        for (int i = 0; i < exercises.length; i++) {
        	exercise_1[i] = exercises[i];
        }

        return exercise_1;
    }

    /**
     * Returns a new ExerciseIterator using the Exercise array
     * @return
     */
    public ExerciseIterator createIterator() {
    	
        return new ExerciseIterator(this.exercises);
    }

    /**
     * Prints name and bio
     */
    public String toString() {
        return (firstName +" "+ lastName + "\n" + bio + "\n");
    }
    
}
