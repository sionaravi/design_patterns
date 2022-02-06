import java.util.*;

public abstract class Car {
    private String make;
    private String model;
    protected abstract void addFrame();

    protected void addWheels(){
        System.out.println("Adding the Wheels");
    }

    protected void addEngine(){
        System.out.println("Adding a Standard Engine");
    }

    protected void addWindows(){
        System.out.println("Adding Windows");
    }

    protected abstract void addAccessories();

    protected void displayAccessories(){
        System.out.println("Accessories:");
        for (Accessories accessory : accessories){
            System.out.println("- " + accessory);
        }
    }

    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public void assemble(){
        System.out.println("Creating a " + make + " " + model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();

    }

}
