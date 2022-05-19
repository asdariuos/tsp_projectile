package com.example.tsp_projectile.domain;

import com.example.tsp_projectile.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Integer> {
}
