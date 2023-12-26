package com.ishaque.design.pattern.creational.methodfactory;

public class BlogPostCreator extends PostCreator{
    @Override
    public Post createPost() {
        return new BlogPost();
    }
}
