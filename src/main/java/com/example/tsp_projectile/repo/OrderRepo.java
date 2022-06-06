package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface OrderRepo extends CrudRepository<Order, Integer> {
/*
    Order findByidOrderN(int idOrder_N);
    //Order findByClientId(int Client_id);
    Order findByPrice(int Price);
    Order findByOrderStatus(String Order_status);
    Order findByOrderDate(Date Order_date);
    //Order findByClientId(Client client);


    //Boolean existsByidOrder_N(int idOrder_N);

    //List<Order> findAllByClientId(Client client);
    List<Order> findAllidOrderN(int idOrder_N);
    //List<Order> findAllByClientId(int Client_id);
    List<Order> findAllByPrice(int Price);
    List<Order> findAllByOrderStatus(String Order_status);//+
    List<Order> findAllByOrderDate(Date Order_date);

    void deleteByIdOrderN(int idOrder_N);
    //void deleteByClientId(int Client_id);
    void deleteByPrice(int Price);
    void deleteOrderStatus(String Order_status);
    void deleteByOrderDate(Date Order_date);
    void deleteByClientId(Client client);
*/



}
