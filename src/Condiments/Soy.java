package Condiments;

import Beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        return beverage.cost() + .2f;
    }

}
