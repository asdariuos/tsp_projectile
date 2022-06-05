package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Author;
import com.example.tsp_projectile.models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepo extends CrudRepository<Genre, Integer> {

    Genre findById(int id);
    Genre findByGenre_name(String Genre_name);
    Boolean existsByGenre_name(String Genre_name);
    List<Genre> findAllById(int id);
    List<Genre> findAllByGenre_name(String Genre_name);


    void deleteAllById(int id);
    void deleteAllByGenre_name(String Genre_name);

}
