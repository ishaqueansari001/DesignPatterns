package com.ishaque.design.pattern.creational.methodfactory;

public class MainTest
{

    public static void main(String[] args) {
        new JsonPostCreator().getPost().writePost();
        new TextPostCreator().getPost().writePost();
        new BlogPostCreator().getPost().writePost();
    }
}
