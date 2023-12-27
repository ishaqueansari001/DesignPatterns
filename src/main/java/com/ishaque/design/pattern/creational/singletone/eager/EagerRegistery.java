package com.ishaque.design.pattern.creational.singletone.eager;

public class EagerRegistery {

    private EagerRegistery(){}
    private static  EagerRegistery INSTANCE= new EagerRegistery();
    public void registryCalled(){
        System.out.println("registry called");
    }

    public static EagerRegistery getInstance(){
        return INSTANCE;
    }
}
