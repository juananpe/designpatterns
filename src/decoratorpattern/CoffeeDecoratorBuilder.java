package decoratorpattern;

import Beverage.*;
import Condiments.Milk;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.Whip;

public class CoffeeDecoratorBuilder {

    private Beverage coffee;

    public CoffeeDecoratorBuilder(String baseBeverage) {
        switch (baseBeverage) {
            case "DarkRoast" -> coffee = new DarkRoast();
            case "Espresso" -> coffee = new Espresso();
            case "Decaf" -> coffee = new Decaf();
            case "HouseBlend" -> coffee = new HouseBlend();
        }
    }

    public CoffeeDecoratorBuilder mocha() {
        coffee = new Mocha(coffee);
        return this;
    }

    public CoffeeDecoratorBuilder soy() {
        coffee = new Soy(coffee);
        return this;
    }

    public CoffeeDecoratorBuilder whip() {
        coffee = new Whip(coffee);
        return this;
    }

    public CoffeeDecoratorBuilder milk() {
        coffee = new Milk(coffee);
        return this;
    }

    public Beverage build() {
        return coffee;
    }

    public static void main(String[] args) {
        Beverage coffee = new CoffeeDecoratorBuilder("DarkRoast")
                .mocha()
                .soy()
                .whip()
                .build();

        System.out.printf("%s %.2f \n", coffee.getDescription(), coffee.cost());

        Beverage espresso = new CoffeeDecoratorBuilder("Espresso").build();
        System.out.printf("%s %.2f", espresso.getDescription(), espresso.cost());
    }

}

