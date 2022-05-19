package com.example.tsp_projectile.models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="instances")
public class Instance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int Product_id;
    private int Order_N;
    private int Copies;
    private boolean Is_deleted;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Product_id")
    private Order order;*/


    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Product product;*/



    public Instance(int Product_id, int Order_N,int Copies) {
        this.Product_id = Product_id;
        this.Order_N = Order_N;
        this.Copies = Copies;
        this.Is_deleted = false;
    }

    public Instance() {

    }

    public int getId(){
        return id;
    }


    public int getProduct_id(){
        return Product_id;
    }

    public void setClient_id(int Product_id){
        this.Product_id=Product_id;
    }

    public int getOrder_N(){
        return Order_N;
    }

    public void setOrder_num(int Order_N){
        this.Order_N=Order_N;
    }


    public int getCopies(){
        return Copies;
    }

    public void setCopies(int Copies){
        this.Copies=Copies;
    }

    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }

    @Override
    public String toString(){
        return "models.Order{"+"id="+id +", Product_id=' " + Product_id + '\'' + ", Order_N=" + Order_N + '\'' + ", Copies=" + Copies + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }


}
