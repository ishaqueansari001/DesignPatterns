package com.ishaque.design.pattern.creational.builder.approach2;

import java.time.LocalDate;

public class MainTest {

    public static void main(String[] args) {
        UserDTO.UserDTOBuilder builder=UserDTO.getUserDTOBuilder();
       UserDTO userDTO= builder.withAddress(getTempUser().getAddress())
                .withFirstName(getTempUser().getFirstName())
                .withLastName(getTempUser().getLastName())
                .withDateOfBirth(getTempUser().getDateOfBirth()).build();

       System.out.println(userDTO);


    }
    public static User getTempUser(){
        User u= new User();
        Address a = new Address();
        a.setArea("221B Baker Street");
        a.setCity("London");
        a.setState("London");
        a.setCountry("England");
        u.setAddress(a);
        u.setDateOfBirth(LocalDate.of(1993,03,28));
        u.setFirstName("Ishaque");
        u.setLastName("Ansari");
        return u;


    }

}
