package com.example.tsp_projectile.models;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "admins")
public class Admin{
    //баг с созданием таблицы.
    //не не баг просто новое DefaultNamingStrategy ,kznm.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    //Можно не указывать Column name если совпадает с таблицей.
    private Date birthdayDate;
    private String login;
    private String adminPassword;
    private String phone;
    private String postInCompany;
    private boolean isDeleted;


    public Admin(String name, Date birthdayDate, String login, String adminPassword, String Phone, String postInCompany){
        this.name=name;
        this.birthdayDate = birthdayDate;
        this.login =login;
        this.adminPassword = adminPassword;
        this.phone =Phone;
        this.postInCompany = postInCompany;
        this.isDeleted =false;
    }

    public Admin() {

    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }


    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name=name;
    }


    public Date getBirthdayDate(){
        return birthdayDate;
    }


    public void setBirthdayDate(Date birthdayDate){
        this.birthdayDate =birthdayDate;
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(String login){
        this.login =login;
    }


    public String getAdminPassword(){
        return adminPassword;
    }


    public void setAdminPassword(String adminPassword){
        this.adminPassword =adminPassword;
    }


    public String getPhone(){
        return phone;
    }


    public void setPhone(String phone){
        this.phone =phone;
    }


    public String getPostInCompany(){
        return postInCompany;
    }


    public void setPostInCompany(String postInCompany){
        this.postInCompany = postInCompany;
    }

    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean isDeleted){
        this.isDeleted =isDeleted;
    }

    @Override
    public String toString(){
        return "models.models.Admin{"+"id="+id +", name=' " + name + '\'' + ", birthdayDate=" + birthdayDate + '\'' + ", login=" + login + '\'' + ", adminPassword=" + adminPassword + '\'' + ", phone=" + phone + '\'' + ", postInCompany=" + postInCompany + '\'' + ", isDeleted=" + isDeleted + '}';
    }

}
