package com.ishaque.design.pattern.creational.methodfactory;

public class JsonPostCreator extends PostCreator{
    @Override
    public Post createPost() {
        return new JsonPost();
    }
}
