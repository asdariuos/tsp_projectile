package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClientRepo extends CrudRepository<Client, Integer> {

    Client findById(int id);
    Client findByClient_name(String Client_name);
    Client findByBirthday_date(Date Birthday_date);
    Client findByLogin(String Login);
    Client findByClient_password(String Client_password);
    Client findByPhone(String Phone);
    Client findByAddress(String Address);

    Boolean existsByLogin(String Login);
    //////////////////


    List<Client> findAllById(int Id);
    List<Client> findAllByClient_name(String Client_name);
    List<Client> findAllByBirthday_date(Date Birthday_date);
    List<Client> findAllByLogin(String Login);
    List<Client> findAllByClient_password(String Client_password);
    List<Client> findAllByPhone(String Phone);
    List<Client> findAllByAddress(String Address);

    void deleteById(int Id);
    void deleteByClient_name(String Client_name);
    void deleteByBirthday_date(Date Birthday_date);
    void deleteByLogin(String Login);
    void deleteByClient_password(String Client_password);
    void deleteByPhone(String Phone);
    void deleteByAddress(String Address);
}
