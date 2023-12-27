package com.ishaque.design.pattern.structural.adapter.classadapter;

public class MainTest {
    public static void main(String[] args) {

        Client c= new Client();
        AdapterCustomer adapterCustomer= new AdapterCustomer();
        tempEmployeee(adapterCustomer);
        c.designeCustomer(adapterCustomer);
    }

    public static void tempEmployeee(Employee e){
        e.setAddress("221 Baker Street");
        e.setJobTitle("Detective");
        e.setName("Sherlock Holmes");


    }
}
