package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepo extends CrudRepository<Publication, Integer> {
}
