package com.example.tsp_projectile.controllers;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

public class AuthorizationController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/greeting")
    public String authorization(Model model) {
        model.addAttribute("title", "Вход");
        return "greeting";
    }

    @PostMapping(value = "/greeting")
    public String checkUser(Model model,
                            @RequestParam(name = "login") String login,
                            @RequestParam(name = "password") String password)
    {
        Client client = new Client();
        Admin admin = new Admin();
        if(login.equals("admin"))
            if(password.equals("1111"))
                return "redirect:/admin_mode";
            else{
                if(clientRepo.existsByLogin(login))
                    client = clientRepo.findByLogin(login);
                else
                    return "/greeting";
                if (client.getClientPassword().equals(password)){
                    return "redirect:/shop?id="+client.getId();
                }else
                    return "/greeting";
            }
        return "/greeting";
    }
}

