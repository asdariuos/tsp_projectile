package com.example.tsp_projectile.controllers;

import com.example.tsp_projectile.models.*;
import com.example.tsp_projectile.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminMenuController {
    private ClientRepo clientRepo;
    private OrderRepo orderRepo;
    private ProductRepo productRepo;

    @Autowired
    AdminMenuController(
            ClientRepo clientRepo,
            OrderRepo orderRepo,
            ProductRepo productRepo
    ){
        this.clientRepo=clientRepo;
        this.orderRepo=orderRepo;
        this.productRepo=productRepo;
    }

    //тут нужны getMappings

    @GetMapping("/adminmenu")
    public String adminmenu(Model model){
        model.addAttribute("title","adminmenu");
        return "admin/adminmenu";
    }

    @GetMapping("/addproduct")
    public String addproduct(Model model) {
        model.addAttribute("title", "addproduct");
        return "admin/addproduct";
    }

    @PostMapping("/addproduct")
    public String addproduct(@RequestParam(name = "Title") String Title,
                             @RequestParam(name = "Author_Name") String Author_Name,
                             @RequestParam(name = "Genre_Name") String Genre_name,
                             @RequestParam(name = "Publication_Name") String Publication_Name,
                             @RequestParam(name = "Description") String Description,
                             @RequestParam(name = "Price") int Price,
                             @RequestParam(name = "Amount") int Amount,
                             Model model) {
        Product product = new Product();
        if (productRepo.existsByAuthorNameAndGenreNameAndPublicationName(Author_Name,Genre_name,Publication_Name))
            return "admin/addproduct";
        else
        product.setAuthorName(Author_Name);
        product.setAmount(Amount);
        product.setGenreName(Genre_name);
        product.setPublicationName(Publication_Name);
        product.setDescription(Description);
        product.setPrice(Price);
        product.setTitle(Title);
        productRepo.save(product);
        return "admin/addproduct";


    }



//Админ может менять статус заказа, добавлять книги.



}
