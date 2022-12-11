package com.danverem.decorator.cofee;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark roasted bean coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
