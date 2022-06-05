package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Integer> {

    Admin findByidOrder_N(int idOrder_N);
    Admin findByClient_id(int Client_id);
    Admin findByPrice(int Price);
    Admin findByOrder_status(String Order_status);
    Admin findByOrder_date(Date Order_date);

    //Boolean existsByidOrder_N(int idOrder_N);

    List<Order> findAllidOrder_N(int idOrder_N);
    List<Order> findAllByClient_id(int Client_id);
    List<Order> findAllByPrice(int Price);
    List<Order> findAllByOrder_status(String Order_status);
    List<Order> findAllByOrder_date(Date Order_date);

    void deleteByidOrder_N(int idOrder_N);
    void deleteByClient_id(int Client_id);
    void deleteByPrice(int Price);
    void deleteOrder_status(String Order_status);
    void deleteByOrder_date(Date Order_date);





}
