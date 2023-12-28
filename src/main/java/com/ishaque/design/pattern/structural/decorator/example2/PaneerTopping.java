package com.ishaque.design.pattern.structural.decorator.example2;

import java.util.List;

public class PaneerTopping implements PizaTopping{
    private PizaTopping topping;
    PaneerTopping(PizaTopping topping){
        this.topping=topping;
    }
    PaneerTopping(){

    }

    @Override
    public void addToping(String topingName) {
        this.topping.addToping(topingName);
    }

    @Override
    public List<String> getToping() {
        return this.topping.getToping();
    }
}
