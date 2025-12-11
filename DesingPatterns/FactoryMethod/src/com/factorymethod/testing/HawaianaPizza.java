package com.factorymethod.testing;

public class HawaianaPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Hawaiana Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Hawaiana Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Hawaiana pizzza");
    }
}
