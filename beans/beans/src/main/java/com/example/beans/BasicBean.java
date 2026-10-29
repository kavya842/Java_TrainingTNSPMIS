package com.example.beans;

public class BasicBean {
    private final String name;

    public BasicBean(String name){
        this.name = name;
    }

    public String greet(){
        return "Hello, " + name + "!";
    }
}