package Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        desc = "House blend";
    }

    @Override
    public float cost() {
        return 3;
    }
}
