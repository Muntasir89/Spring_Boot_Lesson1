package com.monim.spring_boot;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop class constructor called");
    }

    @Override
    public void compile() {
        System.out.println("Compiling the code on Desktop...");
    }
    
}
