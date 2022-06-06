package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Author;
import com.example.tsp_projectile.models.Product;
import com.example.tsp_projectile.models.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PublicationRepo extends CrudRepository<Publication, Integer> {
/*
    Publication findById(int id);
    Publication findByPublicationName(String Publication_name);
    Publication findByProductId(Product product);
    //Boolean existsByPublicationName(String Publication_name);
    List<Publication> findAllById(int id);
    List<Publication> findAllByPublicationName(String Publication_name);
    List<Publication> findAllByProductId(Product product);




    void deleteByProductId(Product product);
    void deleteById(int id);
    void deleteByPublicationName(String Publication_name);
*/
}
