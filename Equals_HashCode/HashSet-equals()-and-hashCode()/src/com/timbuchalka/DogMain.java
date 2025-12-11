package com.timbuchalka;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover =new Labrador("Rover");
        Dog rover2=new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

        //The important key to understand Tim said are:
        //
        //rover2.equals(rover) will call to equals method in Dog class and execute
        //
        //obj instanceof Dog  will return true (because Labrador is a kind of Dog, it is a subclass of Dog)
        //
        //rover.equals(rover2)  will call to equals method in Labrador class and execute
        //
        //obj instanceof Labrador  will return false (we cannot sure obj here is Labrador or not, because not all kind of Dog is Labrador, or Dog is base class of Labrador)
        //
        //Hope that help!

        Dog dog=new Labrador("TestLabrador");
        //dog.ladra(); error

        Labrador labrador=new Labrador("test Labrador");
        labrador.ladra();
        
    }
}
