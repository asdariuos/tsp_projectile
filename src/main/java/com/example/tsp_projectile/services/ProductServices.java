package com.example.tsp_projectile.services;

import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.models.Order;
import com.example.tsp_projectile.models.Product;
import com.example.tsp_projectile.repo.ClientRepo;
import com.example.tsp_projectile.repo.OrderRepo;
import com.example.tsp_projectile.repo.ProductRepo;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServices {


    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ClientRepo clientRepo;
    @Autowired
    private ProductRepo productRepo;

    public void addProduct(String Title, String description, int price, int amount, int order_id, String author_name, String genre_name, String publication_name){
        Product product = new Product();
        Order order = new Order();
        order=orderRepo.findById(order_id);
        product.setTitle(Title);
        product.setDescription(description);
        product.setPrice(price);
        product.setAmount(amount);
        product.setOrder(order);
        product.setAuthorName(author_name);
        product.setGenreName(genre_name);
        product.setPublicationName(publication_name);
        productRepo.save(product);
    }

    public List<Product> findall(){
        return productRepo.findAll();
    }

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }



}
