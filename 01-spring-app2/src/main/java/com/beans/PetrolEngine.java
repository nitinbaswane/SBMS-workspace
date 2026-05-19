package com.beans;





public class PetrolEngine implements IEngine{
    PetrolEngine(){
        System.out.println("PetrolEngine: Constructor");
    }

    public void start(){

        System.out.println("PetrolEngine Started 🚂............");

    }
}
