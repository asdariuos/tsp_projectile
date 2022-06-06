package com.example.tsp_projectile.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     @Column(name = "id")
    private int id;
    private String title;

    private String genreName;

    private String publicationName;

    private String authorName;
    private String description;
    private int price;
    private int amount;

    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public Product(String title, String genreName, String publicationName, String authorName, String description, int price, int amount) {
        this.title = title;
        this.genreName = genreName;
        this.publicationName = publicationName;
        this.authorName = authorName;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.isDeleted = false;
    }

    public Product() {

    }

    public int getId(){
        return id;
    }
    public void setId(int Product_id) {
        this.id = Product_id;
    }
    public String getTitle(){
        return title;
    }


    public void setTitle(String Title){
        this.title =Title;
    }


    public String getGenreName(){
        return genreName;
    }


    public void setGenreName(String genreName){
        this.genreName =genreName;
    }

    public String getPublicationName(){
        return publicationName;
    }

    public void setPublicationName(String publicationName){
        this.publicationName =publicationName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setAuthorName(String authorName){
        this.authorName =authorName;
    }


    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price =price;
    }


    public int getAmount(){
        return price;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean isDeleted){
        this.isDeleted =isDeleted;
    }


    @Override
    public String toString(){
        return "models.models.Product{"+"id="+ id +", Title=' " + title + '\'' + ", Author=" + authorName + '\'' + ", Genre=" + genreName + '\'' + ", Publication=" + publicationName + '\'' + ", Description=" + description + '\'' + ", Price=" + price + '\'' + ", Amount=" + amount + '\'' + ", Is_deleted=" + isDeleted + '}';
    }


}
