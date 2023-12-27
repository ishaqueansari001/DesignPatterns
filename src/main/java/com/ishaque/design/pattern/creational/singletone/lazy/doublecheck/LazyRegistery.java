package com.ishaque.design.pattern.creational.singletone.lazy.doublecheck;

public class LazyRegistery {

    private LazyRegistery(){}

    private static volatile LazyRegistery INSTANCE;

    public static LazyRegistery getInstance(){
        if(INSTANCE==null){
            synchronized (LazyRegistery.class){
                if(INSTANCE==null){
                    INSTANCE= new LazyRegistery();
                }
            }
        }
        return INSTANCE;
    }

}
