package com.ishaque.design.pattern.creational.methodfactory;

public class JsonPost extends Post {

    @Override
    public void writePost() {
        System.out.println( "{key:value}");

    }
}
