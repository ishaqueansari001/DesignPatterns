package com.ishaque.design.pattern.structural.adapter.classadapter;

public class AdapterCustomer extends Employee implements Customer {
    @Override
    public String fullName() {
        return this.getName();
    }

    @Override
    public String designation() {
        return this.getJobTitle();
    }

    @Override
    public String localAddress() {
        return this.getAddress();
    }
}
