package com.ishaque.design.pattern.structural.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEnocderMessage implements Message{

    Message message;
    HtmlEnocderMessage(Message message){
        this.message=message;
    }
    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
