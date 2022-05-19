package com.example.tsp_projectile.domain;

import com.example.tsp_projectile.models.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin, Integer> {
}
