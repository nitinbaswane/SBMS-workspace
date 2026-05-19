package com.beans;

public class SonyPrinter implements IPrinter{
    @Override
    public void print() {
        System.out.println("sonyPrinter: printing receipt...");
    }
}
