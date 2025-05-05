package com.monim.spring_boot;

public class Laptop {
    private String brand;
    private String ram;

    public Laptop() {
        System.out.println("Laptop class constructor called");
    }

    public Laptop(String brand, String ram) {
        this.brand = brand;
        this.ram = ram;
        System.out.println("Laptop class constructor called with brand: " + brand + " and ram: " + ram);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Brand set to: " + brand);
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
        System.out.println("RAM set to: " + ram);
    }

    public void compile() {
        System.out.println("Compiling the code...");
    }
}
