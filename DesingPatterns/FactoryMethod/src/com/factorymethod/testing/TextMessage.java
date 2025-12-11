package com.factorymethod.testing;

public class TextMessage extends Message{


    @Override
    String getContent() {
        return "Message Text";
    }
}
