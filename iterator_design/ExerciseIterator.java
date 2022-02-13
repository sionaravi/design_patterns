package iterator_design;

/**
 * This creates an iterator
 * @author Siona Ravi
 */

public class ExerciseIterator implements Iterator {

    private Exercise[] exercises;
    private int position = 0;
    
    /**
     * Creates an ExerciseIterator
     * @param exercises
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises =  exercises;
    }

    /**
     * Returns true if there more exercise to iterate over
     */
    public boolean hasNext() {
        if (position >= exercises.length || exercises[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the next exercise, if there is one, and null otherwise
     */
    public Exercise next() {
        if(!hasNext()) return null;
        Exercise exercise = exercises[position];
        position = position + 1;
        return exercise;
    }
    
}