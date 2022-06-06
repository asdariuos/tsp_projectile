package com.example.tsp_projectile.models;

import javax.persistence.*;

@Entity
@Table(name = "publications")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String publicationName;
    private boolean isDeleted;


    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public Publication(String publicationName)
    {
        this.publicationName = publicationName;
        this.isDeleted =false;
    }

    public Publication() {

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }


    public String Publication_name(){
        return publicationName;
    }


    public void setPublicationName(String publicationName){
        this.publicationName = publicationName;
    }

    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean isDeleted){
        this.isDeleted =isDeleted;
    }

    @Override
    public String toString(){
        return "models.Publication{"+"id="+id +", Publication_name=' " + publicationName + '\'' + ", Is_deleted=" + isDeleted + '}';
    }
}
