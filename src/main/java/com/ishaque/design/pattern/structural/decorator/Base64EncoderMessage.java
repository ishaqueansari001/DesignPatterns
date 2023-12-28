package com.ishaque.design.pattern.structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncoderMessage implements Message{

    Message message;

    Base64EncoderMessage(Message message){
        this.message=message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(this.message.getContent().getBytes(StandardCharsets.UTF_8));

    }
}
