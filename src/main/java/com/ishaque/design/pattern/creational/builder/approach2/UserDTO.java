package com.ishaque.design.pattern.creational.builder.approach2;

import java.time.LocalDate;

public class UserDTO {

    private String name;
    private String age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static UserDTOBuilder getUserDTOBuilder(){
        return  new UserDTOBuilder();
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public static class UserDTOBuilder {
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
            UserDTO userDTO= new UserDTO();
            userDTO.setName(this.firstName+" "+this.lastName);
            userDTO.setAddress(this.address);
            userDTO.setAge(this.age);
            return  userDTO;
        }

    }

}
