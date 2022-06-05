package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer> {
    Admin findById(int id);
    Admin findByAdmin_name(String Admin_name);
    Admin findByBirthday_date(Date Birthday_date);
    Admin findByLogin(String Login);
    Admin findByAdmin_password(String Admin_password);
    Admin findByPhone(String Phone);
    Admin findByPost_in_company(String Post_in_company);

    Boolean existsByLogin(String Login);

    List<Admin> findAllById(int id);
    List<Admin> findAllByAdmin_name(String Admin_name);
    List<Admin> findAllByBirthday_date(Date Birthday_date);
    List<Admin> findAllByLogin(String Login);
    List<Admin> findAllByAdmin_password(String Admin_password);
    List<Admin> findAllByByPhone(String Phone);
    List<Admin> findAllByPost_in_company(String Post_in_company);

    void deleteById(int id);
    void deleteByAdmin_name(String Admin_name);
    void deleteByBirthday_date(Date Birthday_date);
    void deleteByLogin(String Login);
    void deleteByAdmin_password(String Admin_password);
    void deleteByPhone(String Phone);
    void deleteByPost_in_company(String Post_in_company);





}
