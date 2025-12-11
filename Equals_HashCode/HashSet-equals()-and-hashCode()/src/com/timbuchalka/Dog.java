package com.timbuchalka;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Dog) {
            Dog objName = (Dog) obj;
            return this.getName().equals(objName.getName());
        }
        return false;
    }
}
