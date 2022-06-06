package com.example.tsp_projectile.models;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String authorName;
    private boolean isDeleted;
    public Author (String authorName)
    {
        this.authorName = authorName;
        this.isDeleted =false;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public Author() {

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }


    public String getAuthorName(){
        return authorName;
    }


    public void setAuthorName(String authorName){
        this.authorName =authorName;
    }

    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean isDeleted){
        this.isDeleted =isDeleted;
    }

    @Override
    public String toString(){
        return "models.Author{"+"id="+id +", Author_name=' " + authorName + '\'' + ", isDeleted=" + isDeleted + '}';
    }


}
