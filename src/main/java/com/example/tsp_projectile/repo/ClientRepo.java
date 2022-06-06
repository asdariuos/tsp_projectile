package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface ClientRepo extends CrudRepository<Client, Integer> {
/*
    Client findById(int id);
    Client findByClientName(String Client_name);
    Client findByBirthdayDate(Date Birthday_date);
    Client findByLogin(String Login);
    Client findByClientPassword(String Client_password);
    Client findByPhone(String Phone);
    Client findByAddress(String Address);

    Boolean existsByLogin(String Login);
    //////////////////


    List<Client> findAllById(int Id);
    List<Client> findAllByClientName(String Client_name);
    List<Client> findAllByBirthdayDate(Date Birthday_date);
    List<Client> findAllByLogin(String Login);
    List<Client> findAllByClientPassword(String Client_password);
    List<Client> findAllByPhone(String Phone);
    List<Client> findAllByAddress(String Address);

    void deleteById(int Id);
    void deleteByClientName(String Client_name);
    void deleteByBirthdayDate(Date Birthday_date);
    void deleteByLogin(String Login);
    void deleteByClientPassword(String Client_password);
    void deleteByPhone(String Phone);
    void deleteByAddress(String Address);//+

 */
}
