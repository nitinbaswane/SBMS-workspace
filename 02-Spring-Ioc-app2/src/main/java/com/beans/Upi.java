package com.beans;

public class Upi implements IPayment{
    Upi(){
        System.out.println("UPI : constructor");
    }
    @Override
    public void pay(Double amount) {
        System.out.println("$ "+amount+" paid through upi");
    }
}
