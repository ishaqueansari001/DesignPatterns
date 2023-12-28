package com.ishaque.design.pattern.structural.decorator.example2;

import java.util.ArrayList;
import java.util.List;

public class NormalTomatoTopping implements PizaTopping{
    List<String> topings= new ArrayList<>();
    @Override
    public void addToping(String topingName) {
        topings.add(topingName);
    }

    @Override
    public List<String> getToping() {
        return topings;
    }
}
