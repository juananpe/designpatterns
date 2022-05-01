package decoratorpattern;

import Beverage.Beverage;
import Beverage.DarkRoast;
import Beverage.Espresso;
import Beverage.HouseBlend;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.Whip;


public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        System.out.println("Beverage 1 : ");
        System.out.printf("%s %.2f", b1.getDescription(), b1.cost());
        System.out.println("");

        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Soy(b2);
        b2 = new Whip(b2);
        System.out.println("Beverage 2 : ");
        System.out.printf("%s %.2f", b2.getDescription(), b2.cost());
    }

}
