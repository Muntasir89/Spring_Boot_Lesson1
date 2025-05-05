package com.monim.spring_boot;

public class Dev {

    private Laptop laptop;
    private int age;


    public Dev() {
        System.out.println("Dev class constructor called");
    }

    public Dev(Laptop laptop) {
        System.out.println("Dev class constructor called with age: " + age);
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("Age set to: " + age);
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Laptop set to: " + laptop);
    }

    public void build() {
        System.out.println("Building the project...");
    }
}
