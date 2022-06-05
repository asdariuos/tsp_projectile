package com.example.tsp_projectile.models;

import javax.persistence.*;

@Entity
@Table(name = "publications")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Publication_name;
    private boolean Is_deleted;


    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public Publication(String Publication_name)
    {
        this.Publication_name=Publication_name;
        this.Is_deleted=false;
    }

    public Publication() {

    }

    public int getId(){
        return id;
    }


    public String Publication_name(){
        return Publication_name;
    }


    public void setPublication_name(String Publication_name){
        this.Publication_name=Publication_name;
    }

    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }

    @Override
    public String toString(){
        return "models.Publication{"+"id="+id +", Publication_name=' " + Publication_name + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }
}
