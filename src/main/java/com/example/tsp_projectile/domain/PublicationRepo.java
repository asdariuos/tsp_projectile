package com.example.tsp_projectile.domain;

import com.example.tsp_projectile.models.Publication;
import org.springframework.data.repository.CrudRepository;

public interface PublicationRepo extends CrudRepository<Publication, Integer> {
}
