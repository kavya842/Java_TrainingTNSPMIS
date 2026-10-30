package com.example.bean;

public class BasicBean {

    private final String name;

    public BasicBean(String name){
        this.name = name;

    }

    public String greet(){
        return "HII " + name + "!";

    }
}