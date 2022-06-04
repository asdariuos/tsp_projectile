package com.example.tsp_projectile.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder_N;
    private int Client_id;
    private int Price;
    private String Order_status;
    private Date Order_date;
    private boolean Is_deleted;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Order_N")
    private List<Instance> instances;

    public List<Instance> getInstances(){
        return instances;
    }
    public void  setOrders(List<Instance> instances){
        this.instances=instances;
    }
    public Order(int Client_id, int Price, String Order_status, Date Order_date) {
        this.Client_id = Client_id;
        this.Price = Price;
        this.Order_status = Order_status;
        this.Order_date = Order_date;
        this.Is_deleted = false;
    }

    public Order(){

    }

    public int getIdOrder_N(){
        return idOrder_N;
    }

    public int getClient_id(){
        return Client_id;
    }

    public void setClient_id(int Client_id){
        this.Client_id=Client_id;
    }

    public int getPrice(){
        return Price;
    }

    public void setPrice(int Price){
        this.Price=Price;
    }

    public String getOrder_status(){
        return Order_status;
    }

    public void setOrder_status(String Order_status){
        this.Order_status=Order_status;
    }

    public void setOrder_date(Date Order_date){
        this.Order_date=Order_date;
    }

    public java.sql.Date getOrder_date(){

        java.sql.Date sqlDate = new java.sql.Date(Order_date.getTime());
        return  sqlDate;
        //возможна утечка думаю.

    }

    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }

    @Override
    public String toString(){
        return "models.Order{"+"idOrder_N="+idOrder_N +", Client_id=' " + Client_id + '\'' + ", Price=" + Price + '\'' + ", Order_status=" + Order_status  + '\'' + ", Order_date=" + Order_date  + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }

}

