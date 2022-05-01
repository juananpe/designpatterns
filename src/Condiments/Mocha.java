package Condiments;

import Beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return beverage.cost() + .5f;
    }

}
