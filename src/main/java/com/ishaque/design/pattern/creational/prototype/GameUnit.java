package com.ishaque.design.pattern.creational.prototype;

import java.awt.*;

public abstract class GameUnit implements Cloneable{

    Point pointLocation = new Point();

    public void moveLocation(int x, int y) {
        this.pointLocation.move(x, y);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit pointer=(GameUnit) super.clone();
        pointer.initialize();

        return pointer;
    }

    public void initialize(){
        this.pointLocation=new Point();
        this.reset();
    }

    public abstract void attack();
    public abstract void reset();

}

class SowrdsMan extends GameUnit {
    public String state="idle";

    public void attack(){
        this.state="attacking";
    }
    @Override
    public void reset() {
        this.state="idle";
    }

    @Override
    public String toString() {
        return "SowrdsMan{" +
                "pointLocation=" + pointLocation +
                ", state='" + state + '\'' +
                '}';
    }
}

class General extends GameUnit {
    public String state="idle";

    public void attack(){
        this.state="giving direction for attack";
    }
    @Override
    public void reset() {
        this.state="idle";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Army General can be one only");
    }
}