package com.ishaque.design.pattern.creational.simplefactory;

public class MainTest
{

    public static void main(String[] args) {
        PostFactory.getPost("text").writePost();
        PostFactory.getPost("json").writePost();
        PostFactory.getPost("blog").writePost();
        PostFactory.getPost("else").writePost();

    }
}
