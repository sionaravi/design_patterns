public class LuxuryCar extends Car{
    public LuxuryCar(String make, String model) {
        super(make, model);
        addAccessories();
        // Calls the assemble method from Car class
        assemble();
    }

    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    @Override
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }

    // Adds list of accessories to the Arraylist
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
    }
}
