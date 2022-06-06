package com.example.tsp_projectile;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class MainController {
/*
    @Autowired
    private AdminRepo adminRepository;

    @Autowired
    private AuthorRepo authorRepository;

    @Autowired
    private ClientRepo clientRepository;

    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private ProductRepo productRepository;

    @Autowired
    private PublicationRepo publicationRepository;
*/

    @GetMapping("/greeting")
    public String greeting() {

       /* Iterable<Admin> admin = adminRepository.findAll();
        model.addAttribute("admins", admin);*/

        return "greeting";
    }

  //@GetMapping ("/registration")
    //public String registration() {
//
//
     //   return "registration";
   // }

    @GetMapping ("/shop")
    public String shop() {


        return "shop";
    }
}
