package com.in28minutes.java.threads;

public class ExampleRuneable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread since Runneable");
    }

    public static void main(String[] args) {
        ExampleRuneable exampleRuneable=new ExampleRuneable();

        Thread myThread=new Thread(exampleRuneable);
        myThread.start();
        System.out.println("Thread Main");

    }
}
