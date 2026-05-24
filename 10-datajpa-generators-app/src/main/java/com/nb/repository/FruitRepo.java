package com.nb.repository;

import com.nb.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepo extends JpaRepository<Fruit,String> {
}
