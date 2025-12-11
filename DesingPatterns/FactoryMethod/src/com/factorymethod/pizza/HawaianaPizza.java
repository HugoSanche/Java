package com.factorymethod.pizza;

public class HawaianaPizza implements Pizza{
    @Override
    public void Cut() {
        System.out.println("Cortando Hawaiana Pizza");
    }

    @Override
    public void Box() {
        System.out.println("La pizza Hawaiana se esta guardando");
    }
}
