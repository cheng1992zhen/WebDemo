package com.example.demo;

import javax.persistence.Entity;
import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
