package com.factorymethod.pizza;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory pepperoniPizzaFactory=new PepperoniPizzaFactory();
        Pizza peperoni= pepperoniPizzaFactory.CreatePizza();
        peperoni.Box();
        peperoni.Cut();
    }
}
