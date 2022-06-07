package com.example.tsp_projectile.services;

import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.models.Order;
import com.example.tsp_projectile.models.Product;
import com.example.tsp_projectile.repo.ClientRepo;
import com.example.tsp_projectile.repo.OrderRepo;
import com.example.tsp_projectile.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.tsp_projectile.services.ClientServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServices {


 @Autowired
 private OrderRepo orderRepo;
 @Autowired
 private ClientRepo clientRepo;
 @Autowired
 private ProductRepo productRepo;

    public void addOrder(int price,String order_status,int client_id){
        Order order = new Order();
        Client client = new Client();
        client=clientRepo.findById(client_id);
        order.setOrderStatus(order_status);
        order.setPrice(price);
        order.setClient(client);
        orderRepo.save(order);
    }

    public List<Order> findall(){
        return orderRepo.findAll();
    }
    public void deleteOrder(int id){
        orderRepo.deleteById(id);
    }





}
