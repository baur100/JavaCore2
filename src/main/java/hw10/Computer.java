package hw10;

import java.util.Arrays;

public class Computer {
    private String brand;
    private String CPU;
    private int RAM;
    private int SSD;
    private int price;
    private int[] payment;

    public Computer() {
    }

    public Computer(String brand, String CPU, int RAM, int SSD, int HDD, int price) {
        this.brand = brand;
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;
        this.price = price;
        this.payment = payment;
    }

    public Computer(String brand, String CPU, int price) {
        this.brand = brand;
        this.CPU = CPU;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public int getPrice() {
        return price;
    }

    public int[] getPayment(int[] credit) {
        return this.payment;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public void setPayment(int[] credit) {
        this.payment = credit;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("\tBrand - " + this.brand +
                "\n\tCPU Model - " + this.CPU +
                "\n\tRAM GB - " + this.RAM +
                "\n\tStorage SSD GB - " + this.SSD +
                "\n\tPrice - " + this.price +
                "\n\tPayment / Total months - " + Arrays.toString(this.payment));
    }

}



