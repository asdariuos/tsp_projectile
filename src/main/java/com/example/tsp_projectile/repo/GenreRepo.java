package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepo extends CrudRepository<Genre, Integer> {

}
