package com.example.tsp_projectile.controllers;

import com.example.tsp_projectile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {


    @Autowired
    private ClientRepo clientRepo;


    @GetMapping ("/shop-2")
     public String shop() {
         return "shop-2";
     }

   /* @PostMapping("/shop-2")
    public String toCart() {

        return "redirect:/cart";
    }*/

}
