package factory_design;

/**
 * This is a CarFactory class where the cars are made
 * @author Siona Ravi
 *
 */

public class CarFactory {
    static Car car;
    
    /**
     * The create car method  will create a car based on the type passed.
     * And It will call assemble on the car, and then return it.
     * @param type
     * @param make
     * @param model
     * @return
     */
    public static Car createCar(String type, String make, String model) {

        if (type.equals("small")) {
            car = new SmallCar(make, model);
        } else if (type.equals("sedan")) {
            car = new SedanCar(make, model);
        } else if (type.equals("luxury")) {
            car = new LuxuryCar(make, model);
        }
        return car;

    }

}
