package com.danverem.decorator.diagram;

public class ConcreteDecoratorA extends Decorator {

    private Component component;
    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }
    @Override
    public void methodA() {
        component.methodA();
    }

    @Override
    public void methodB() {
        component.methodB();
    }
}
