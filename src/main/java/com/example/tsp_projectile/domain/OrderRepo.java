package com.example.tsp_projectile.domain;

import com.example.tsp_projectile.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Integer> {
}
