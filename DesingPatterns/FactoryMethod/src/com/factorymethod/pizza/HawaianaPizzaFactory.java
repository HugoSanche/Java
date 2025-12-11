package com.factorymethod.pizza;

public class HawaianaPizzaFactory implements PizzaFactory{
    @Override
    public Pizza CreatePizza() {
        return new HawaianaPizza();
    }
}
