package com.in28minutes.java.innerclass;

public class OuterClass2 {
    private int value=2026;
    class InnerClass{
        public void sayHello(){
            System.out.println("Feliz Navidad:"+value);
        }
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2=new OuterClass2();

        InnerClass innerClass=outerClass2.new InnerClass();
        innerClass.sayHello();
    }
}
