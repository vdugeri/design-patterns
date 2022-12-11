package com.danverem.decorator.cofee;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Most unique house blend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
