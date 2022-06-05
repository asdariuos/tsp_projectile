package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Integer> {
    Author findById(int id);
    Author findByAuthor_name(String Author_name);
    //Boolean existsByAuthor_name(String Author_name);
    List<Author> findAllById(int id);
    List<Author> findAllByAuthor_name(String Author_name);


    void deleteAllById(int id);
    void deleteAllByAuthor_name(String Author_name);


}
