package com.factorymethod.testing;

public class PepperoniPizzaFactory implements FactoryPizza{
    @Override
    public Pizza CretePizza() {
        return new PepperoniPizza();
    }
}
