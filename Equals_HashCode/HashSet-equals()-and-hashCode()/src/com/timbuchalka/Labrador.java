package com.timbuchalka;

public class Labrador extends Dog{

    public Labrador(String name) {
        super(name);
    }
    public void ladra(){
        System.out.println("Ladra");
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
     if (obj instanceof Labrador){
        Labrador objName=(Labrador) obj;
        return  this.getName().equals(objName.getName());
     }
     return false;
    }
}













