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

    Product findById(int id);
    Product findByTitle(String Title);
    Product findByDescription(String Description);
    Product findByPrice(int Price);
    Product findByAmount(int Amount);

    Product findByGenreName(String GenreName);
    Product findByPublicationName(String PublicationName);
    Product findByAuthorName(String AuthorName);

    Boolean existsByAuthorNameAndGenreNameAndPublicationName(String AuthorName,String GenreName,String PublicationName);/////////блiн.

    List<Product> findAllById(int id);
    List<Product> findAllByTitle(String Title);

    List<Product> findAllByDescription(String Description);
    List<Product> findAllByAuthorName(String AuthorName);
    List<Product> findAllByGenreName(String GenreName);
    List<Product> findAllByPublicationName(String PublicationName);
    List<Product> findAllByPrice(int Price);
    List<Product> findAllByAmount(int Amount);
    List<Product> findAll();

    void deleteById(int id);
    void deleteByTitle(String Title);
    void deleteByDescription(String Description);
    void deleteByAuthorName(String AuthorName);
    void deleteByPublicationName(String PublicationName);
    void deleteByGenreName(String GenreName);
    void deleteByPrice(int Price);
    void deleteByAmount(int Amount);

}

