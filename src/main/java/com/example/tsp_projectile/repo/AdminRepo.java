package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer> {
}
