package com.nb.dao;

import org.springframework.stereotype.Repository;

@Repository("credit")
public class CreditCard implements IPayment{
    @Override
    public void pay() {
        System.out.println("paid through: CreditCard");
    }
}
