package Condiments;

import Beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public float cost() {
        return beverage.cost() + .6f;
    }

}
