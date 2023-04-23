package com.kerbabian.khachigkerbabian_assignment_3.Bean;

import java.util.Date;

public class Employee {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String emailAddress;
    private String hireDate;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return emailAddress;
    }

    public void setEmail(String emailAddres) { this.emailAddress = emailAddres; }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hirDate) { this.hireDate = hirDate; }


}
