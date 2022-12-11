package com.danverem.decorator.cofee;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf("%s -- %s%.2f\n", beverage.getDescription(), "$", beverage.cost());

        Beverage darkRoastWhipDoubleMocha = new Mocha(new Mocha(new Whip(new DarkRoast())));
        System.out.printf("%s -- %s%.2f\n", darkRoastWhipDoubleMocha.getDescription(), "$", darkRoastWhipDoubleMocha.cost());

        Beverage houseBlendSoyMochaWhip = new Soy(new Mocha(new Whip(new HouseBlend())));
        System.out.printf("%s -- %s%.2f\n", houseBlendSoyMochaWhip.getDescription(), "$", houseBlendSoyMochaWhip.cost());

        Beverage decafWithSteamedMilk = new SteamedMilk(new Whip(new Decaf()));
        System.out.printf("%s -- %s%.2f\n", decafWithSteamedMilk.getDescription(), "$", decafWithSteamedMilk.cost());
    }
}
