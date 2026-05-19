package com.beans;

public class CreditCard implements IPayment{
    CreditCard(){
        System.out.println("CreditCard : constructor");

    }

    @Override
    public void pay(Double amount) {
        System.out.println("$ "+amount+" paid through CreditCard");

    }
}
