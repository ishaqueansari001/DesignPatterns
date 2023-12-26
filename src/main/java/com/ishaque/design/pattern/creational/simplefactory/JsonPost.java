package com.ishaque.design.pattern.creational.simplefactory;

public class JsonPost extends Post{

    @Override
    public void writePost() {
        System.out.println( "{key:value}");

    }
}
