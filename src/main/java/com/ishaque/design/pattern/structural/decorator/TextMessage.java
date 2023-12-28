package com.ishaque.design.pattern.structural.decorator;

public class TextMessage implements Message{
    private String message;
    TextMessage(String message){
        this.message=message;
    }

    @Override
    public String getContent() {
        return this.message;
    }
}
