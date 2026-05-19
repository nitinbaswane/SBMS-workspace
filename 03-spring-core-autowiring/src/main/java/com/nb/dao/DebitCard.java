package com.nb.dao;

import org.springframework.stereotype.Repository;

@Repository("debit")
public class DebitCard implements IPayment{
    @Override
    public void pay() {
        System.out.println("paid through: DebitCard");
    }
}
