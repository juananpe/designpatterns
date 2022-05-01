package Condiments;

import Beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + .3f;
    }

}
