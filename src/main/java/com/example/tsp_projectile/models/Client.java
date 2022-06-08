package com.example.tsp_projectile.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String clientName;
    //private Date birthdayDate;
    private String login;
    private String clientPassword;
    private String phone;
    private String address;
    private boolean isDeleted;
    /*@OneToMany(cascade = CascadeType.ALL,mappedBy ="Client_id")
    private List<Order> orders;
    public List<Order> getOrders(){
        return orders;
    }
    public void  setOrders(List<Order> orders){
        this.orders=orders;
    }
     */
    public Client(String name, String Login, String clientPassword, String Phone, String Address) {
        this.clientName = name;
        //this.birthdayDate = birthdayDate;
        this.login = Login;
        this.clientPassword = clientPassword;
        this.phone = Phone;
        this.address = Address;
        this.isDeleted = false;

    }

    public  Client(){}


    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }


    public String getName(){
        return clientName;
    }


    public void setName(String name){
        this.clientName =name;
    }


    //public Date getBirthdayDate(){
     //   return birthdayDate;
    //}


    //public void setBirthdayDate(Date Birthday_date){
      //  this.birthdayDate =Birthday_date;
    //}


    public String getLogin() {
        return login;
    }


    public void setLogin(String Login){
        this.login =Login;
    }


    public String getClientPassword(){
        return clientPassword;
    }


    public void setClientPassword(String Client_password){
        this.clientPassword =Client_password;
    }


    public String getPhone(){
        return phone;
    }


    public void setPhone(String Phone){
        this.phone =Phone;
    }


    public String getAddress(){
        return address;
    }


    public void setAddress(String Address){
        this.address =Address;
    }


    public boolean getDeleted(){
        return isDeleted;
    }


    public void setDeleted(boolean Is_deleted){
        this.isDeleted =Is_deleted;
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
        return "Client{"+"id="+id +", Client_name=' " + clientName + '\'' + ", login=" + login + '\'' + ", Client_password=" + clientPassword + '\'' + ", Phone=" + phone + '\'' + ", Address=" + address + '\'' + ", Is_deleted=" + isDeleted + '}';

    }

}
