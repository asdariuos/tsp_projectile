package com.example.tsp_projectile.models;
import javax.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String genreName;
    private boolean isDeleted;
    public Genre(){}

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public Genre(String genreName)
    {
        this.genreName = genreName;
        this.isDeleted =false;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {return id;}
    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
    @Override
    public String toString(){
        return "models.genres{"+"id="+id +", Genre_name=' " + genreName + '\'' + ", Is_deleted=" + isDeleted + '}';
    }

}
