package com.ishaque.design.pattern.structural.adapter.objectaddapter;

public class AdapterCustomer implements Customer{

    Employee e;
    public AdapterCustomer(Employee e){
        this.e=e;
    }
    @Override
    public String fullName() {
        return e.getName();
    }

    @Override
    public String designation() {
        return e.getJobTitle();
    }

    @Override
    public String localAddress() {
        return e.getAddress();
    }
}
