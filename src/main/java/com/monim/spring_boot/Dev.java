package com.monim.spring_boot;

public class Dev {

    // private Laptop laptop;
    private int age;


    public Dev() {
        System.out.println("Dev class constructor called");
    }

    public Dev(int age) {
        System.out.println("Dev class constructor called with age: " + age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("Age set to: " + age);
    }

    public void build() {
        System.out.println("Building the project...");
    }
}
