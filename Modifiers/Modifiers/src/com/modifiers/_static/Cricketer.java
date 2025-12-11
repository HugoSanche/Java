package com.modifiers._static;

public class Cricketer {
    private static int count;

    public Cricketer() {
        count++;
    }

     static int getCount(){
        return count;
    }

}
