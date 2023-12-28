package com.ishaque.design.pattern.structural.decorator.example2;

public class MainTest {

    public static void main(String[] args) {
        PizaTopping topping= new NormalTomatoTopping();
        topping.addToping("tomato");

        PizaTopping cheezeTopping=new CheeseTopping(topping);
        cheezeTopping.addToping("cheese");

        PizaTopping paneerTopping= new PaneerTopping(cheezeTopping);
        paneerTopping.addToping("paneer");

        System.out.println(paneerTopping.getToping());

        PizaTopping topping2= new NormalTomatoTopping();
        topping2.addToping("tomato");


        PizaTopping paneerTopping2= new PaneerTopping(topping2);
        paneerTopping2.addToping("paneer");

        System.out.println(paneerTopping2.getToping());


    }

}
