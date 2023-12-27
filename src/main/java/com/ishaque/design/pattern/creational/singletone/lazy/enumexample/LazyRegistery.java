package com.ishaque.design.pattern.creational.singletone.lazy.enumexample;

public enum LazyRegistery {
    INSTANCE;

    public void registery(){
        System.out.println("printing registry");
    }
}
