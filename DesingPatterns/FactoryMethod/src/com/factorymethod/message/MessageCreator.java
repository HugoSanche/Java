package com.factorymethod.message;

public abstract class MessageCreator {
    public Message getMessage(){
        Message msg =CreateMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    public abstract Message CreateMessage();
}













