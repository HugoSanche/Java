package com.factorymethod.testing;

public class ClienteMessage {
    public static void main(String[] args) {
        getMessage(new JSONMessageCreator());
    }

    public static void getMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        msg.getContent();
        System.out.println(msg);
    }
}
