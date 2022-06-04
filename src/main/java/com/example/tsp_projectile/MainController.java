package com.example.tsp_projectile;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private AdminRepo adminRepository;

    @Autowired
    private AuthorRepo authorRepository;

    @Autowired
    private ClientRepo clientRepository;

    @Autowired
    private InstanceRepo instanceRepository;

    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private ProductRepo productRepository;

    @Autowired
    private PublicationRepo publicationRepository;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Stranger") String name, Model model) {
        model.addAttribute("name", name);
        Iterable<Admin> admin = adminRepository.findAll();
        model.addAttribute("admins", admin);
        return "greeting";
    }




}