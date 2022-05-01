package Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        desc = "Decaf";
    }

    @Override
    public float cost() {
        return 4;
    }
}
