package com.ishaque.design.pattern.creational.singletone.lazy.innerclass;

public class MainTest {

    public static void main(String[] args) {
        LazyRegisteryHolder instance=LazyRegisteryHolder.getInstance();
        LazyRegisteryHolder instance1=LazyRegisteryHolder.getInstance();
        LazyRegisteryHolder instance2=LazyRegisteryHolder.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance2==instance);
    }
}

