package decoratorpattern;

import Beverage.*;
import Condiments.Milk;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.Whip;

public class CoffeeBuilder extends Beverage{

    private Beverage coffee;

    public String getDescription(){
        return coffee.getDescription();
    }

    @Override
    public float cost() {
        return coffee.cost();
    }

    public CoffeeBuilder(String baseBeverage) {
        switch (baseBeverage) {
            case "DarkRoast" -> coffee = new DarkRoast();
            case "Espresso" -> coffee = new Espresso();
            case "Decaf" -> coffee = new Decaf();
            case "HouseBlend" -> coffee = new HouseBlend();
        }
    }

    public CoffeeBuilder mocha() {
        coffee = new Mocha(coffee);
        return this;
    }

    public CoffeeBuilder soy() {
        coffee = new Soy(coffee);
        return this;
    }

    public CoffeeBuilder whip() {
        coffee = new Whip(coffee);
        return this;
    }

    public CoffeeBuilder milk() {
        coffee = new Milk(coffee);
        return this;
    }

    public static void main(String[] args) {
        Beverage coffee = new CoffeeBuilder("DarkRoast")
                .mocha()
                .soy()
                .whip();

        System.out.printf("%s %.2f \n", coffee.getDescription(), coffee.cost());

        Beverage espresso = new CoffeeBuilder("Espresso");
        System.out.printf("%s %.2f", espresso.getDescription(), espresso.cost());

    }

}

