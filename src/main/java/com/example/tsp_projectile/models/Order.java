package com.example.tsp_projectile.models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    private String orderStatus;
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client=client;
    }

    public Order(int Price, String orderStatus) {
        this.price = Price;
        this.orderStatus = orderStatus;
        this.isDeleted = false;
    }

    public Order(){

    }
    public void setId(int idOrder_N) {
        this.id = idOrder_N;
    }
    public int getId(){
        return id;
    }

   /* public int getClient_id(){
        return Client_id;
    }*/

   /* public void setClient_id(int Client_id){
        this.Client_id=Client_id;
    }*/

    public int getPrice(){
        return price;
    }

    public void setPrice(int Price){
        this.price =Price;
    }

    public String getOrderStatus(){
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }



    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean isDeleted){
        this.isDeleted =isDeleted;
    }

    @Override
    public String toString(){
        return "models.Order{"+"idOrder_N="+ id + '\'' + ", Price=" + price + '\'' + ", Order_status=" + orderStatus + '\'' +  '\'' + ", Is_deleted=" + isDeleted + '}';
    }

}

