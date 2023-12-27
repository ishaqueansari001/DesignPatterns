package com.ishaque.design.pattern.creational.prototype;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameUnit swordsMan= new SowrdsMan();
        swordsMan.moveLocation(10,20);
        swordsMan.attack();
        System.out.println(swordsMan);
        GameUnit swordsMan2= swordsMan.clone();
        System.out.println(swordsMan2);

        GameUnit armyGeneral= new General();
        armyGeneral.attack();

        GameUnit armyGeneral1=armyGeneral.clone();

    }
}
