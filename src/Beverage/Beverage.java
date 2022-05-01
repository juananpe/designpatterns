package Beverage;

public abstract class Beverage {
    String desc = "unknown beverage";

    public String getDescription() {
        return desc;
    }

    public abstract float cost();
}
