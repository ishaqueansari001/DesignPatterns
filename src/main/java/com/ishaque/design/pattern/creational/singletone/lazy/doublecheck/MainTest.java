package com.ishaque.design.pattern.creational.singletone.lazy.doublecheck;


public class MainTest {
    public static void main(String[] args) {
    LazyRegistery registery1= LazyRegistery.getInstance();
    LazyRegistery registery2= LazyRegistery.getInstance();

    System.out.println(registery1==registery2);

    }
}
