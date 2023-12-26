package com.ishaque.design.pattern.creational.simplefactory;

public class BlogPost extends  Post{

    @Override
    public void writePost() {
        System.out.println( "blog Post");
    }
}
