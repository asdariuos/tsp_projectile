package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    /*  @Query(value = "select Product.Title,instance.Copies from Product,Instance where Product.Product_id= Instance.Product_id")
    public List<Product> product();
    public List<Instance> instance();
*/

    Product findById(int id);
    Product findByTitle(String Title);
    Product findByAuthor_id(int Author_id);
    Product findByGenre_id(int Genre_id);
    Product findByPublication_id(int Publication_id);
    Product findByDescription(String Description);
    Product findByPrice(int Price);
    Product findByAmount(int Amount);


    //Boolean existsByAuthor_idAndGenre_idAndPublication_id(int Author_id,int Genre_id,int Publication_id);/////////блiн.

    List<Product> findAllById(int id);
    List<Product> findAllByTitle(String Title);
    List<Product> findAllByAuthor_id(int Author_id);
    List<Product> findAllByGenre_id(int Genre_id);
    List<Product> findAllByPublication_id(int Publication_id);
    List<Product> findAllByDescription(String Description);
    List<Product> findAllByPrice(int Price);
    List<Product> findAllByAmount(int Amount);



    void deleteById(int id);
    void deleteByTitle(String Title);
    void deleteByAuthor_id(int Author_id);
    void deleteByGenre_id(int Genre_id);
    void deleteByPublication_id(int Publication_id);
    void deleteByDescription(String Description);
    void deleteByPrice(int Price);
    void deleteByAmount(int Amount);


}

