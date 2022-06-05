package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Instance;
import com.example.tsp_projectile.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    /*  @Query(value = "select Product.Title,instance.Copies from Product,Instance where Product.Product_id= Instance.Product_id")
    public List<Product> product();
    public List<Instance> instance();
*/
}

