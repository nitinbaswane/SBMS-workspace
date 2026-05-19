package com.nb.service;

import com.nb.dao.IPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShopingCart {

    private IPayment iPayment;

    ShopingCart(){
        System.out.println("ShopingCart::constructor");
    }


    ShopingCart( IPayment iPayment) {
        this.iPayment = iPayment;
    }
    @Autowired
    @Qualifier("debit")
    public void setiPayment(IPayment iPayment) {
        System.out.println("ShopingCart:setterrr");
        this.iPayment = iPayment;
    }

    public void placeOrder(){
        iPayment.pay();
    }
}
