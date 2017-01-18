package com.example.amitpalo.loginapp;

/**
 * Created by Amit Palo on 9/25/2016.
 */

public class Person {

    int id;
    String name;
    String password;
    String email;
    long phone;

    public Person() {}

    public Person(int id,String name,String password,String email,long phone) {
        this.id =  id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}

