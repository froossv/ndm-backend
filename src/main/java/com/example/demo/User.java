package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userName;
    private String password;
    private String phone;

    public User(){

    }

    public User(String u, String p, String ph){
        this.userName=u;
        this.password=p;
        this.phone=ph;
    }
}

