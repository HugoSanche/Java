package com.factorymethod.pizza;

public class PepperoniPizzaFactory implements PizzaFactory{
    @Override
    public Pizza CreatePizza() {
        return new PepperoniPizza();
    }
}
