package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface AdminRepo extends CrudRepository<Admin, Integer> {
    /*
    Admin findById(int id);
    Admin findByName(String Admin_name);
    Admin findByBirthdayDate(Date Birthday_date);//+
    Admin findByLogin(String Login);
    Admin findByAdminPassword(String Admin_password);
    Admin findByPhone(String Phone);
    Admin findByPostInCompany(String Post_in_company);

    Boolean existsByLogin(String Login);

    List<Admin> findAllById(int id);
    List<Admin> findAllByName(String Admin_name);
    List<Admin> findAllByBirthdayDate(Date Birthday_date);
    List<Admin> findAllByLogin(String Login);
    List<Admin> findAllByAdminPassword(String Admin_password);//+
    List<Admin> findAllByPhone(String Phone);
    List<Admin> findAllByPostInCompany(String Post_in_company);

    void deleteById(int id);
    void deleteByName(String Admin_name);
    void deleteByBirthdayDate(Date Birthday_date);
    void deleteByLogin(String Login);
    void deleteByAdminPassword(String Admin_password);//+
    void deleteByPhone(String Phone);
    void deleteByPostInCompany(String Post_in_company);


*/


}
