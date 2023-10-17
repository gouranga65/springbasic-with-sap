package com.example.sundarsaptest001.springbasic.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class SonyHdd implements IhardDisk {

    @Override
    public void startHdd() {
        // TODO Auto-generated method stub
        System.out.println("inside SONY StartHDD");
    }

    @Override
    public void readHdd() {
        // TODO Auto-generated method stub
        System.out.println("inside SONY ReadHDD");
    }
    
}
