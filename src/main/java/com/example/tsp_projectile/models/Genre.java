package com.example.tsp_projectile.models;
import javax.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Genre_name;
    private boolean Is_deleted;
    public Genre(){}


    public Genre(String Genre_name)
    {
        this.Genre_name=Genre_name;
        this.Is_deleted=false;
    }

    public String getGenre_name() {
        return Genre_name;
    }

    public void setGenre_name(String genre_name) {
        Genre_name = genre_name;
    }

    public boolean isIs_deleted() {
        return Is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        Is_deleted = is_deleted;
    }
    @Override
    public String toString(){
        return "models.genres{"+"id="+id +", Genre_name=' " + Genre_name + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }

}
