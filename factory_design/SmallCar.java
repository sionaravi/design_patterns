package factory_design;

/**
 * This is the class for SmallCar where the accessories are put together for small cars.
 * @author Siona Ravi
 */
public class SmallCar extends Car {
	
    /**
     * Adds the frame by displaying "Adding a small frame"
     */
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    /**
     * Adds the following accessories: Floor Mats and Phone charger
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
	    
     /**
     * This method  will make the car based on the model passed it.
     * And It will call assemble the car.
     * @param make
     * @param model
     */	    
    public SmallCar(String make, String model) {
        super(make, model);
        addAccessories();
        assemble();
    }

    }
}
