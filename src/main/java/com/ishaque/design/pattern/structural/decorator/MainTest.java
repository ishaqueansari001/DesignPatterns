package com.ishaque.design.pattern.structural.decorator;

public class MainTest {
    public static void main(String[] args) {
        Message m= new TextMessage("<p>this is a paragraph</p>");
        System.out.println(m.getContent());
        Message html=new HtmlEnocderMessage(m);
        System.out.println(html.getContent());

        Message base64=new Base64EncoderMessage(m);
        System.out.println(base64.getContent());

    }
}
