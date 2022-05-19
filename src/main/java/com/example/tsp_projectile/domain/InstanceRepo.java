package com.example.tsp_projectile.domain;

import com.example.tsp_projectile.models.Instance;
import org.springframework.data.repository.CrudRepository;

public interface InstanceRepo extends CrudRepository<Instance, Integer> {
}
