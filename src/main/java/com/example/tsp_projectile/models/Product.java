package com.example.tsp_projectile.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     @Column(name = "id")
    private int productId;
    private String title;
    private int authorId;
    private int genreId;
    private int publicationId;
    private String description;
    private int price;
    private int amount;

    private String imgPath;
    private boolean isDeleted;

    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Author author;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Genre genre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Publication publication;
    public Genre getGenre(){
        return genre;
    }
    public void  setGenre(Genre genre){
        this.genre=genre;
    }
    public Author getAuthor(){
        return author;
    }
    public void  setAuthor(Author author){
        this.author=author;
    }
    public Publication getPublication(){
        return publication;
    }
    public void  setPublication(Publication publication){
        this.publication=publication;
    }

*/
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product(String title, int authorId, int genreId, int publicationId, String description, int price, int amount, String imgPath) {
        this.title = title;
        this.authorId = authorId;
        this.genreId = genreId;
        this.publicationId = publicationId;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.imgPath = imgPath;
        this.isDeleted = false;
    }

    public Product() {

    }

    public int getId(){
        return productId;
    }
    public void setId(int Product_id) {
        this.productId = Product_id;
    }
    public String getTitle(){
        return title;
    }


    public void setTitle(String Title){
        this.title =Title;
    }


    public int getAuthorId(){
        return authorId;
    }


    public void setAuthorId(int authorId){
        this.authorId =authorId;
    }

    public int getGenreId(){
        return genreId;
    }

    public void setGenreId(int genreId){
        this.genreId =genreId;
    }

    public int getPublicationId(){
        return publicationId;
    }

    public void setPublicationId(int publicationId){
        this.publicationId =publicationId;
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
    public String getImgPath(){return imgPath;}
    public void setImgPath(String imgPath){this.imgPath =imgPath;}
    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean isDeleted){
        this.isDeleted =isDeleted;
    }


    @Override
    public String toString(){
        return "models.models.Product{"+"id="+ productId +", Title=' " + title + '\'' + ", Author_id=" + authorId + '\'' + ", Genre_id=" + genreId + '\'' + ", Publication_id=" + publicationId + '\'' + ", Description=" + description + '\'' + ", Price=" + price + '\'' + ", Amount=" + amount + '\'' + ", Is_deleted=" + isDeleted + '}';
    }


}
