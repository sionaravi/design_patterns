package factory_design;

/**
 * Car class will hold variables to keep track of the cars: make, model and 
 * the list of accessories.
 * @author Siona Ravi
 */

import java.util.*;

public abstract class Car {
	
    private String make;
    private String model;
    protected abstract void addFrame();
    protected abstract void addAccessories();
    
    /**
     * Displays "Adding the wheels"
     */
    protected void addWheels() {
    	
        System.out.println("Adding the Wheels");
    }
    
    /**
     * Displays "Adding a Standard Engine"
     */
    protected void addEngine() {
    	
        System.out.println("Adding a Standard Engine");
    }
    
    /**
     * Displays "Adding Windows"
     */
    protected void addWindows() {
    	
        System.out.println("Adding Windows");
    }

    /**
     * Displays the accessories from Enums
     */
    protected void displayAccessories() {
    	
        System.out.println("Accessories:");
        	for (Accessories accessory : accessories){
        		System.out.println("- " + accessory);
        }
    }
    
    
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    public Car(String make, String model) {
    	
        this.make = make;
        this.model = model;
    }
    
    /**
     * Calls each the methods from the class
     */
    public void assemble() {
    	
        System.out.println("Creating a " + make + " " + model);
        
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }
}
