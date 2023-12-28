package com.ishaque.design.pattern.structural.decorator.example2;

import java.util.List;

public interface PizaTopping {

    void addToping(String topingName);
    List<String> getToping();
}
