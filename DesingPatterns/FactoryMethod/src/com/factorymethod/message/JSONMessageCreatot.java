package com.factorymethod.message;

public class JSONMessageCreatot extends MessageCreator {

    @Override
    public Message CreateMessage() {
        return new JSONMessage();
    }
}

