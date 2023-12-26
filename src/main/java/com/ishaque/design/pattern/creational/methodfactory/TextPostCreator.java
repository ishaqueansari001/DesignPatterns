package com.ishaque.design.pattern.creational.methodfactory;

public class TextPostCreator extends  PostCreator{
    @Override
    public Post createPost() {
        return new TextPost();
    }
}
