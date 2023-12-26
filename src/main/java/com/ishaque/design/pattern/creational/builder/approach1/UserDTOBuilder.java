package com.ishaque.design.pattern.creational.builder.approach1;

import java.time.LocalDate;

public class UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;


    public UserDTOBuilder withFirstName(String firstName){
        this.firstName=firstName;

        return this;
    }

    public UserDTOBuilder withLastName(String lastName){
        this.lastName =lastName;

        return this;
    }
    public UserDTOBuilder withDateOfBirth(LocalDate dateOfBirth){
      int age= LocalDate.now().getYear()- dateOfBirth.getYear();
      this.age=Integer.toString(age);
        return this;
    }
    public UserDTOBuilder withAddress(Address address){
        this.address=address.toString();
        return this;
    }
    public UserDTO build(){
        UserDTO userDTO= new UserDTO(firstName+" "+lastName,this.age,this.address);
        return  userDTO;
    }

}
