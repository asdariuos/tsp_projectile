package com.example.tsp_projectile.models;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Author_name;
    private boolean Is_deleted;
    public Author (String Author_name)
    {
        this.Author_name=Author_name;
        this.Is_deleted=false;
    }

    public Author() {

    }

    public int getId(){
        return id;
    }


    public String getAuthor_name(){
        return Author_name;
    }


    public void setAuthor_name(String Author_name){
        this.Author_name=Author_name;
    }

    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }

    @Override
    public String toString(){
        return "models.Author{"+"id="+id +", Author_name=' " + Author_name + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }


}
