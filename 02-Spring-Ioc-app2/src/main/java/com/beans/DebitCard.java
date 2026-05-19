package com.beans;

public class DebitCard implements IPayment{
    DebitCard(){
        System.out.println("DebitCard : constructor");

    }
    @Override
    public void pay(Double amount) {
        System.out.println("$ "+amount+" paid through DebitCard");

    }
}
