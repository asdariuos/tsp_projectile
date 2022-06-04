package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Integer> {
}
