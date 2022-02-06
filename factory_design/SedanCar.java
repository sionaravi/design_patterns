public class SedanCar extends Car {

    @Override
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    @Override
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }

    public SedanCar(String make, String model) {
        super(make, model);
        addAccessories();
        assemble();
    }
}
