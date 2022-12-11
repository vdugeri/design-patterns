package com.danverem.decorator.cofee;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public abstract double cost();
    public String getDescription() {
        return this.description;
    }
}
