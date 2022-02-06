package factory_design;


/**
 * This is the class for SedanCar where the accessories are put together for sedan cars.
 * @author Siona Ravi
 */

public class SedanCar extends Car {

    /**
     * Adds the frame by displaying "Adding a three part frame"
     */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }
	
    /**
     * Adds the following accessories from enum
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }

    /**
     * This method  will make the car based on the model passed it.
     * And It will call assemble the car.
     * @param make
     * @param model
     */
    public SedanCar(String make, String model) {
        super(make, model);
        addAccessories();
        assemble();
    }
}

