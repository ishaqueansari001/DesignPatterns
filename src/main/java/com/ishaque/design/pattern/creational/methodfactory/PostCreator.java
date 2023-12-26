package com.ishaque.design.pattern.creational.methodfactory;

public abstract class PostCreator {
    public Post getPost(){
        return  createPost();
    }

    protected abstract Post createPost();
}
