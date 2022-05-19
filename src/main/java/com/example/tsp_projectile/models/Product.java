package com.example.tsp_projectile.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String Title;
    private int Author_id;
    private int Genre_id;
    private int Publication_id;
    private String Description;
    private int Price;
    private int Amount;
    //private Link_cover_photo;
    private boolean Is_deleted;

    /*@ManyToOne(fetch = FetchType.LAZY)
     * JoinColumn(name = "client_id")
     * private models.Client client;
     */

    public Product(String Title, int Author_id, int Genre_id, int Publication_id, String Description, int Price, int Amount) {
        this.Title = Title;
        this.Author_id = Author_id;
        this.Genre_id = Genre_id;
        this.Publication_id = Publication_id;
        this.Description = Description;
        this.Price = Price;
        this.Amount = Amount;
        this.Is_deleted = false;
    }

    public Product() {

    }

    public int getId(){
        return id;
    }


    public String getTitle(){
        return Title;
    }


    public void setTitle(String Title){
        this.Title=Title;
    }


    public int getAuthor_id(){
        return Author_id;
    }


    public void setAuthor_id(int Author_id){
        this.Author_id=Author_id;
    }

    public int getGenre_id(){
        return Genre_id;
    }

    public void setGenre_id(int Genre_id){
        this.Genre_id=Genre_id;
    }

    public int getPublication_id(){
        return Publication_id;
    }

    public void setPublication_id(int Publication_id){
        this.Publication_id=Publication_id;
    }


    public String getDescription(){
        return this.Description;
    }

    public void setDescription(String Description){
        this.Description=Description;
    }

    public int getPrice(){
        return Price;
    }

    public void setPrice(int Price){
        this.Price=Price;
    }


    public int getAmount(){
        return Price;
    }

    public void setAmount(int Amount){
        this.Amount=Amount;
    }

    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }


    @Override
    public String toString(){
        return "models.models.Product{"+"id="+id +", Title=' " + Title + '\'' + ", Author_id=" + Author_id + '\'' + ", Genre_id=" + Genre_id  + '\'' + ", Publication_id=" + Publication_id  + '\'' + ", Description=" + Description  + '\'' + ", Price=" + Price  + '\'' + ", Amount=" + Amount  + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }


}
