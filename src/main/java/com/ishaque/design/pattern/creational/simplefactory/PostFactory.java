package com.ishaque.design.pattern.creational.simplefactory;

public class PostFactory {

    public static Post getPost(String type){
        switch (type) {
            case "text": return new TextPost();
            case "json": return new JsonPost();
            case "blog": return new BlogPost();
            default: throw new IllegalArgumentException("not correct type");
        }

    }
}
