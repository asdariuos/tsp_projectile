package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer> {
}
