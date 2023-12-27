package com.ishaque.design.pattern.creational.singletone.lazy.enumexample;

public class MainTest {

    public static void main(String[] args) {
        LazyRegistery registry= LazyRegistery.INSTANCE;
        registry.registery();
        LazyRegistery registry1= LazyRegistery.INSTANCE;
        LazyRegistery registry2= LazyRegistery.INSTANCE;
        System.out.println(registry==registry1);
        System.out.println(registry==registry2);
    }
}
