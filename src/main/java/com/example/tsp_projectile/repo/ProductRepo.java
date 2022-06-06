package com.example.tsp_projectile.repo;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface ProductRepo extends CrudRepository<Product, Integer> {
    /*  @Query(value = "select Product.Title,instance.Copies from Product,Instance where Product.Product_id= Instance.Product_id")
    public List<Product> product();
    public List<Instance> instance();
*/
/*
    Product findById(int id);
    Product findByTitle(String Title);
    Product findByAuthorId(int Author_id);
    Product findByGenreId(int Genre_id);
    Product findByPublicationId(int Publication_id);
    Product findByDescription(String Description);
    Product findByPrice(int Price);
    Product findByAmount(int Amount);
    Product findByIMGPath(String IMG_path);//+


    Boolean existsByAuthorIdAndGenreIdAndPublicationId(int Author_id,int Genre_id,int Publication_id);/////////блiн.

    List<Product> findAllById(int id);
    List<Product> findAllByTitle(String Title);
    List<Product> findAllByAuthorId(int Author_id);
    List<Product> findAllByGenreId(int Genre_id);
    List<Product> findAllByPublicationId(int Publication_id);
    List<Product> findAllByDescription(String Description);
    List<Product> findAllByPrice(int Price);
    List<Product> findAllByAmount(int Amount);
    List<Product> findAllByIMGPath(String IMG_path);


    void deleteById(int id);
    void deleteByTitle(String Title);
    void deleteByAuthorId(int Author_id);
    void deleteByGenreId(int Genre_id);
    void deleteByPublicationId(int Publication_id);
    void deleteByDescription(String Description);
    void deleteByPrice(int Price);
    void deleteByAmount(int Amount);
    void deleteByIMGPath(String IMG_path);
*/
}

