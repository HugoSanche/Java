package com.in28minutes.java.threads;

public class ExampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Second Thread");
    }
    public static void main(String[] args) {
        ExampleThread exampleThread=new ExampleThread();
        exampleThread.start();
        System.out.println("Thread Main");
    }
}
