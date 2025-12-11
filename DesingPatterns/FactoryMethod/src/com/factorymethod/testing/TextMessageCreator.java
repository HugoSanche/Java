package com.factorymethod.testing;

public class TextMessageCreator extends MessageCreator{
    @Override
    Message createMessage() {
        return new TextMessage();
    }
}
