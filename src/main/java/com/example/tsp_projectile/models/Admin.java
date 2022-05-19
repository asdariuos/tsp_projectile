package com.example.tsp_projectile.models;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "admins")
public class Admin{

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "Admin_name")
    private String name;
    //Можно не указывать Column name если совпадает с таблицей.
    private Date Birthday_date;
    private String Login;
    private String Admin_password;
    private String Phone;
    private String Post_in_company;
    private boolean Is_deleted;


    public Admin(String name, Date Birthday_date, String Login, String Admin_password,String Phone,String Post_in_company){
        this.name=name;
        this.Birthday_date= Birthday_date;
        this.Login=Login;
        this.Admin_password=Admin_password;
        this.Phone=Phone;
        this.Post_in_company=Post_in_company;
        this.Is_deleted=false;
    }

    public Admin() {

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


    public Date getBirthday_date(){
        return Birthday_date;
    }


    public void setBirthday_date(Date Birthday_date){
        this.Birthday_date=Birthday_date;
    }


    public String getLogin() {
        return Login;
    }


    public void setLogin(String Login){
        this.Login=Login;
    }


    public String getAdmin_password(){
        return Admin_password;
    }


    public void setAdmin_password(String Admin_password){
        this.Admin_password=Admin_password;
    }


    public String getPhone(){
        return Phone;
    }


    public void setPhone(String Phone){
        this.Phone=Phone;
    }


    public String getPost_in_company(){
        return Post_in_company;
    }


    public void setPost_in_company(String Post_in_company){
        this.Post_in_company=Post_in_company;
    }

    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }

    @Override
    public String toString(){
        return "models.models.Admin{"+"id="+id +", Admin_name=' " + name + '\'' + ", Birthday_date=" + Birthday_date + '\'' + ", login=" + Login  + '\'' + ", Admin_password=" + Admin_password  + '\'' + ", Phone=" + Phone  + '\'' + ", Post_in_company=" + Post_in_company  + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }

}
