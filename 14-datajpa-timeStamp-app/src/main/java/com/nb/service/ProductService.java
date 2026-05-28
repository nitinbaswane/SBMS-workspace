package com.nb.service;

import com.nb.entity.Product;
import com.nb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void saveData(){
        Product p= new Product();
        p.setProductName("parle-g");
        p.setProductPrice(10);
        productRepo.save(p);

        Product p1= new Product();

        p1.setProductName("good-day");
        p1.setProductPrice(20);
        productRepo.save(p1);
    }

    @Transactional
    public void updateData(){

        Product p = productRepo.findById(1).orElseThrow(()->new RuntimeException("product not found"));

        p.setProductName("Britania");
        p.setProductPrice(15);

    }

}
