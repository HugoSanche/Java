package com.factorymethod.message;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message CreateMessage() {
        return new TextMessage();
    }
}
