package Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public float cost() {
        return 1;
    }
}
