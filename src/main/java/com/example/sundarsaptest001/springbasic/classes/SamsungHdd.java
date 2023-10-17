package com.example.sundarsaptest001.springbasic.classes;

import org.springframework.stereotype.Component;

@Component
public class SamsungHdd implements IhardDisk {

    @Override
    public void startHdd() {
        // TODO Auto-generated method stub
        System.out.println("inside SAMSUNG startHdd");
    }

    @Override
    public void readHdd() {
        // TODO Auto-generated method stub
        System.out.println("inside SAMSUNG readHdd");
    }

}
