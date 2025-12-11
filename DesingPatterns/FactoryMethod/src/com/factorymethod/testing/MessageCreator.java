package com.factorymethod.testing;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg =createMessage();
        msg.encrypt();
        msg.send();
        return msg;
    }

    abstract Message createMessage();
}
