package com.example.sundarsaptest001.springbasic.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int length;
    private int width;
    private String brandName;
    @Autowired
    private IhardDisk ihardDisk;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Laptop() {
        System.out.println("hello sundar :)");
        // this.ihardDisk.readHdd();

    }

    public void bootLaptop() {
        this.ihardDisk.readHdd();
    }

    @Override
    public String toString() {
        return "Laptop [length=" + length + ", width=" + width + ", brandName=" + brandName + "]";
    }

}
