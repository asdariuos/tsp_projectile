package com.example.tsp_projectile.controllers;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AuthorizationController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/authorization")
    public String authorization(Model model) {
        model.addAttribute("title", "Регистрация");
        return "authorization";
    }

    @PostMapping(value = "/authorization")
    public String checkUser(Model model,
                            @RequestParam(name = "login") String login,
                            @RequestParam(name = "password") String password)
    {
        Client client = new Client();
        Admin admin = new Admin();
        if(login.equals("admin"))
            if(password.equals("1111"))
                return "redirect:/adminmenu";
            else{
                if(clientRepo.existsByLogin(login))
                    client = clientRepo.findByLogin(login);
                else
                    return "/authorization";
                if (client.getClientPassword().equals(password)){
                    return "redirect:/clientmenu?id="+client.getId();
                }else
                    return "/authorization";
            }
        return "/authorization";
    }
}
