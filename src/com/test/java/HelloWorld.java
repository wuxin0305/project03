package com.test.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HelloWorld {

    private String name;

    private int id;
    
    private String email;

    public String getName() {
        return name;
    }

    public HelloWorld(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloWorld that = (HelloWorld) o;
        return Objects.equals(name, that.name);
    }


    public void setName(String name) {

        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("hello world");

        List list = new ArrayList();

    }

public  static void method1() {
    System.out.println("ddd");

    try {
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

}


