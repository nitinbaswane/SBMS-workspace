package com.beans;

public class DieselEngine implements IEngine{
    DieselEngine(){
        System.out.println("DieselEngine: constructor");
    }
    @Override
    public void start() {
        System.out.println("DieselEngine started.............");
    }
}
