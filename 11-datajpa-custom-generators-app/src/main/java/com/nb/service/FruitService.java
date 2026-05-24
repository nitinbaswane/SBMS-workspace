package com.nb.service;

import com.nb.entity.Fruit;
import com.nb.repository.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepo fruitRepo;

    public void addFruits(){
        Fruit f1 = new Fruit();
        f1.setFruitName("Apple");
        f1.setFruitColor("Red");
        f1.setFruitShape("Circular");

        Fruit f2 = new Fruit();
        f2.setFruitName("Banana");
        f2.setFruitColor("Yellow");
        f2.setFruitShape("Long");

        Fruit f3 = new Fruit();
        f3.setFruitName("Mango");
        f3.setFruitColor("Yellow");
        f3.setFruitShape("Oval");

        Fruit f4 = new Fruit();
        f4.setFruitName("Orange");
        f4.setFruitColor("Orange");
        f4.setFruitShape("Circular");

        Fruit f5 = new Fruit();
        f5.setFruitName("Grapes");
        f5.setFruitColor("Green");
        f5.setFruitShape("Round");

        Fruit f6 = new Fruit();
        f6.setFruitName("Watermelon");
        f6.setFruitColor("Green");
        f6.setFruitShape("Oval");

        Fruit f7 = new Fruit();
        f7.setFruitName("Pineapple");
        f7.setFruitColor("Brown");
        f7.setFruitShape("Cylindrical");

        Fruit f8 = new Fruit();
        f8.setFruitName("Strawberry");
        f8.setFruitColor("Red");
        f8.setFruitShape("Heart");

        Fruit f9 = new Fruit();
        f9.setFruitName("Papaya");
        f9.setFruitColor("Orange");
        f9.setFruitShape("Oval");

        Fruit f10 = new Fruit();
        f10.setFruitName("Guava");
        f10.setFruitColor("Green");
        f10.setFruitShape("Round");
        List<Fruit> fruitList=List.of(f1,f2,f3,f4,f5,f6,f7,f8,f9,f10);
        fruitRepo.saveAll(fruitList);
    }
}
