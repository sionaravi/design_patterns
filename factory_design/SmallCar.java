public class SmallCar extends Car {
    public SmallCar(String make, String model) {
        super(make, model);
        addAccessories();
        // Calls the assemble method from Car class
        assemble();
    }

    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    // Adds list of accessories to the Arraylist
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);

    }
}
