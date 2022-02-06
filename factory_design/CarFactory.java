public class CarFactory {
    static Car car;

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
