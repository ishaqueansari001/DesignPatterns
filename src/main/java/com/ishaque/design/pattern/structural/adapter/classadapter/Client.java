package com.ishaque.design.pattern.structural.adapter.classadapter;

public class Client {

    public void designeCustomer(Customer customer){
        System.out.println(customer.designation());
        System.out.println(customer.localAddress());
        System.out.println(customer.fullName());

    }
}
