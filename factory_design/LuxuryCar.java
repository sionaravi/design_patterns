package factory_design;

/**
 * This is the class for LuxuryCar where the accessories are put together for luxury cars.
 * @author Siona Ravi
 */
public class LuxuryCar extends Car{

    /**
     * Overwrites and displays "Adding a Supped Up Engine"
     */
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }
	
    /**
     * Adds the frame by displaying "Adding a beautiful frame"
     */
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Adds the accessories
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
	  
   /**
    * This method  will make the car based on the model passed it.
    * And It will call assemble the car.
    * @param make
    * @param model
    */
    public LuxuryCar(String make, String model) {
        super(make, model);
        addAccessories();
        assemble();
    }
    }
}
