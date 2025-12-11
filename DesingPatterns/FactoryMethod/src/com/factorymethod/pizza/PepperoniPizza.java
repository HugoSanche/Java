package com.factorymethod.pizza;

public class PepperoniPizza implements Pizza{
    @Override
    public void Cut() {
        System.out.println("Cortando Peperoni Pizza");
    }

    @Override
    public void Box() {
        System.out.println("La pizza de Peperoni se esta guardando");
    }
}
