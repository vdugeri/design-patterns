package com.danverem.decorator.diagram;

public class ConcreteDecoratorB extends Decorator {
    private Component component;

    public ConcreteDecoratorB(Component component) {
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
