package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Author;
import com.example.tsp_projectile.models.Genre;
import com.example.tsp_projectile.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface GenreRepo extends CrudRepository<Genre, Integer> {
/*
    Genre findById(int id);
    Genre findByGenreName(String Genre_name);
    //Genre findByproductId(Product product);
    Boolean existsByGenreName(String Genre_name);
    List<Genre> findAllById(int id);
    List<Genre> findAllByGenreName(String Genre_name);//+
    //List<Genre> findAllByproductId(Product product);

    //void deleteByproductId(Product product);

    void deleteById(int id);
    void deleteByGenreName(String Genre_name);
*/
}
