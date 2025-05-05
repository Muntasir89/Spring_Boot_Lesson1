package com.monim.spring_boot;

public class Dev {

    private Computer com;

    public Dev() {
        System.out.println("Dev class constructor called");
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {
        System.out.println("Building the project...");
    }
}
