package com.factorymethod.testing;


public class Cliente {
    public static void main(String[] args) {


       FactoryPizza factoryPizza=new PepperoniPizzaFactory();
       Pizza pepperoni=factoryPizza.CretePizza();
       pepperoni.prepare();
       pepperoni.cut();
       pepperoni.box();


    }
}
