package com.nb.repository;

import com.nb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository <Product,Integer>{
}
