package com.beans;

public class ShopingCart {
    IPayment iPayment;
    ShopingCart(){
        System.out.println("ShopingCart: non-param constructor");
    }

    ShopingCart(IPayment iPayment){
        this.iPayment=iPayment;
    }
    public void placeOrder(Double d){
        iPayment.pay(d);
        System.out.println("order placed..........");
    }
}
