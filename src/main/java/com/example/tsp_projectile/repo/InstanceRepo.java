package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Instance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstanceRepo extends CrudRepository<Instance, Integer> {
}
