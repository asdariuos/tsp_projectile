package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends CrudRepository<Client, Integer> {
}
