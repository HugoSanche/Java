package com.factorymethod.testing;

public class JSONMessageCreator extends MessageCreator{
    @Override
    Message createMessage() {
        return new JSONMessage();
    }
}
