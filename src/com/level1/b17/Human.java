package com.level1.b17;

public class Human {
    private String firstName;
    private String secondName;
    private String email;
    private String phone = "380 00 0000000";

    public Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private String getSecondName() {
        return this.secondName;
    }

    private String getEmail() {
        return this.email;
    }

    private String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getSecondName() + " |email: " + this.getEmail() + "| |phone= " + this.getPhone() +"|\n";
    }


}
