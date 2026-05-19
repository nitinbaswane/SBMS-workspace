package com.beans;

public class Car {
    private IEngine eng;

    public Car(IEngine e) {
        this.eng = e;
        System.out.println("Car: Constructor");

    }

    public void setEng(IEngine eng) {
        this.eng = eng;
        System.out.println("..setter..injection..");
    }

    public void drive() {
        eng.start();
        System.out.println("Driving 🚘..........");
    }
}
