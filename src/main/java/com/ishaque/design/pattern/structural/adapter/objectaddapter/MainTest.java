package com.ishaque.design.pattern.structural.adapter.objectaddapter;

public class MainTest {
    public static void main(String[] args) {

        Client c= new Client();
        AdapterCustomer adapterCustomer= new AdapterCustomer(tempEmployeee());
        c.designeCustomer(adapterCustomer);
    }

    public static Employee tempEmployeee(){
        Employee e= new Employee();
        e.setAddress("221 Baker Street");
        e.setJobTitle("Detective");
        e.setName("Sherlock Holmes");
        return  e;

    }
}
