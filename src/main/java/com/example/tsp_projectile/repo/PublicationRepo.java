package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Author;
import com.example.tsp_projectile.models.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepo extends CrudRepository<Publication, Integer> {

    Publication findById(int id);
    Publication findByPublication_name(String Publication_name);
    //Boolean existsByPublication_name(String Publication_name);
    List<Publication> findAllById(int id);
    List<Publication> findAllByPublication_name(String Publication_name);


    void deleteAllById(int id);
    void deleteAllByPublication_name(String Publication_name);

}
