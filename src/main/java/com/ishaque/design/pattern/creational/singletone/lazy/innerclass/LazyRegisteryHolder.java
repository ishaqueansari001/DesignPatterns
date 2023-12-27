package com.ishaque.design.pattern.creational.singletone.lazy.innerclass;

public class LazyRegisteryHolder {

    private LazyRegisteryHolder(){
    System.out.println("Initializing the LazyRegistery");
    }
    private static class LazyRegistery{
        public static LazyRegisteryHolder INSTANCE= new LazyRegisteryHolder();
    }
    public static LazyRegisteryHolder getInstance(){
        return LazyRegistery.INSTANCE;
    }


}
