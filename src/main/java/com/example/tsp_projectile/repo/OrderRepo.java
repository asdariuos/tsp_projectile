package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Instance;
import com.example.tsp_projectile.models.Order;
import com.example.tsp_projectile.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Integer> {
}
