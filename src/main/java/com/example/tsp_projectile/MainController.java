package com.example.tsp_projectile;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ClientRepo clientRepository;
/*
    @Autowired
    private AdminRepo adminRepository;

    @Autowired
    private AuthorRepo authorRepository;

    @Autowired


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

    /*@PostMapping(value="/list")
    public String ListController(@PathVariable(value="id") int id,@PathVariable(value="isDeleted") String isDeleted,@PathVariable(value="clientPassword") String clientPassword,@PathVariable(value="clientName") String clientName,@PathVariable(value="phone") String phone,@PathVariable(value="login") String login, @PathVariable(value="address") String address, Model model){
        List<Client> enemylist = clientRepository.findAllById(1);
        model.addAttribute("id",id);
        model.addAttribute("address",address);
        model.addAttribute("login",login);
        model.addAttribute("phone",phone);
        model.addAttribute("clientName",clientName);
        model.addAttribute("clientPassword",clientPassword);
        model.addAttribute("isDeleted",isDeleted);
        return "list";
    }*/
    @GetMapping(value = "/list")
    public String getClients(Model model) {
       // List<Client> clients = this.clientRepository.findAllById(1);
        model.addAttribute("name", this.clientRepository.findById(1));

        return "list";
    }

    /*   @GetMapping ("/shop")
    public String shop() {
        return "shop";
    }*/
}
