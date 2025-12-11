package com.factorymethod.testing;

public class HawainaPizzaFactory implements FactoryPizza{
    @Override
    public Pizza CretePizza() {
        return new HawaianaPizza();
    }
}
