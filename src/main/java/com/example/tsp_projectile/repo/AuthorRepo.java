package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Author;
import com.example.tsp_projectile.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AuthorRepo extends CrudRepository<Author, Integer> {
   /*
    Author findById(int id);
    Author findByAuthorName(String Author_name);
    //Author findByProductId(Product product);


    List<Author> findAllById(int id);
    List<Author> findAllByAuthorName(String Author_name);
    //List<Author> findAllByProductId(Product product);



    void deleteById(int id);
    void deleteByAuthorName(String Author_name);//+
    //void deleteByProductId(Product product);
*/
}
