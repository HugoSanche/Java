package com.factorymethod.message;

public class Cliente {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreatot());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);

    }
}
