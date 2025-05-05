package com.monim.spring_boot;

public class Laptop implements Computer{

    public Laptop() {
        System.out.println("Laptop class constructor called");
    }

    public void compile() {
        System.out.println("Compiling the code...");
    }
}
