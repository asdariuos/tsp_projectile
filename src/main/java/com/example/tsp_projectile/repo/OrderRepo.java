package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface OrderRepo extends CrudRepository<Order, Integer> {

    Order findById(int Id);
    Order findByPrice(int Price);
    Order findByOrderStatus(String Order_status);
    Order findByOrderDate(Date Order_date);


    Boolean existsById(int Id);


    List<Order> findAllById(int Id);
    List<Order> findAllByPrice(int Price);
    List<Order> findAllByOrderStatus(String Order_status);//+
    List<Order> findAllByOrderDate(Date Order_date);

    void deleteById(int Id);
    void deleteByPrice(int Price);
    void deleteByOrderStatus(String Order_status);
    void deleteByOrderDate(Date Order_date);




}
