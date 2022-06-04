package com.example.tsp_projectile.models;

import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "Client_name")
    private String name;
    private Date Birthday_date;
    private String Login;
    private String Client_password;
    private String Phone;
    private String Address;
    private boolean Is_deleted;
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="Client_id")
    private List<Order> orders;
    public List<Order> getOrders(){
        return orders;
    }
    public void  setOrders(List<Order> orders){
        this.orders=orders;
    }
    public Client(String name, Date Birthday_date, String Login, String Client_password, String Phone, String Address) {
        this.name = name;
        this.Birthday_date = Birthday_date;
        this.Login = Login;
        this.Client_password = Client_password;
        this.Phone = Phone;
        this.Address = Address;
        this.Is_deleted = false;

    }

    public  Client(){

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


    public String getClient_password(){
        return Client_password;
    }


    public void setClient_password(String Client_password){
        this.Client_password=Client_password;
    }


    public String getPhone(){
        return Phone;
    }


    public void setPhone(String Phone){
        this.Phone=Phone;
    }


    public String getAddress(){
        return Address;
    }


    public void setAddress(String Address){
        this.Address=Address;
    }


    public boolean getIs_deleted(){
        return Is_deleted;
    }


    public void setIs_deleted(boolean Is_deleted){
        this.Is_deleted=Is_deleted;
    }


    /*
     * public List<products> getProducts(){
     * return products;
     * }
     * */


    /*public void setProducts(List<products> products){
     * this.products = products;
     * }
     * */


    @Override
    public String toString(){
        return "models.models.Client{"+"id="+id +", Client_name=' " + name + '\'' + ", Birthday_date=" + Birthday_date + '\'' + ", login=" + Login  + '\'' + ", Client_password=" + Client_password  + '\'' + ", Phone=" + Phone  + '\'' + ", Address=" + Address  + '\'' + ", Is_deleted=" + Is_deleted + '}';
    }

}
