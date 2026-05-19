package com.beans;

public class HpPrinter implements IPrinter{
    @Override
    public void print() {
        System.out.println("HpPrinter : printing receipt....");
    }
}
