package com.danverem.decorator.cofee;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Coffee without coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
