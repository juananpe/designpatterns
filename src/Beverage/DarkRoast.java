package Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        desc = "Dark roast";
    }

    @Override
    public float cost() {
        return 2;
    }
}
