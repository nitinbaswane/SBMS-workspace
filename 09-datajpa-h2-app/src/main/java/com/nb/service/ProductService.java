package com.nb.service;

import com.nb.entity.Product;
import com.nb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void saveData(){
        Product p= new Product();
//        p.setProductId(101);
        p.setProductName("parle-g");
        p.setProductPrice(10);
        productRepo.save(p);
    }

}
