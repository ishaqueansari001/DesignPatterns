package com.ishaque.design.pattern.structural.decorator.example2;

import java.util.List;

public class CheeseTopping implements PizaTopping{
    private PizaTopping pizzaTopping;
    CheeseTopping(PizaTopping topping){
        this.pizzaTopping=topping;
    }
    CheeseTopping(){}

    @Override
    public void addToping(String topingName) {
        pizzaTopping.addToping(topingName);
    }

    @Override
    public List<String> getToping() {
        return this.pizzaTopping.getToping();
    }
}
