package com.danverem.decorator.cofee;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Sweet and smooth italian";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
