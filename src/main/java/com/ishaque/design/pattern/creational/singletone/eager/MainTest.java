package com.ishaque.design.pattern.creational.singletone.eager;

public class MainTest {
    public static void main(String[] args) {
        EagerRegistery registery=EagerRegistery.getInstance();
        registery.registryCalled();
        EagerRegistery registery2=EagerRegistery.getInstance();
        registery.registryCalled();
        System.out.println(registery==registery2);

    }
}
