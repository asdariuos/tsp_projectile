package com.example.tsp_projectile.controllers;

import com.example.tsp_projectile.models.Admin;
import com.example.tsp_projectile.models.Client;
import com.example.tsp_projectile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class RegistrationController {

    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("title","REgister");
        return "registration";
    }

    /*public String addUser(Model model,
                          @RequestParam(name = "login") String login,
                          @RequestParam(name = "client_name") String clientName,
                          @RequestParam(name = "client_password") String clientPassword,
                          @RequestParam(name = "phone") String phone,
                          @RequestParam(name = "address") String address,
                          @RequestParam(name = "birthday_date") Date birthdayDate)
    {
        Client client = new Client();
        client.setClientPassword(clientPassword);
        client.setAddress(address);
        client.setBirthdayDate(birthdayDate);
        client.setLogin(login);
        client.setName(clientName);
        client.setPhone(phone);
        clientRepo.save(client);
        model.addAttribute("client",client);
        return "redirect:/greeting";
    }*/

    @PostMapping(value = "/registration")
    public String PostRegistrationController(@RequestParam String clientName, @RequestParam String phone, @RequestParam String address, @RequestParam String login, @RequestParam String clientPassword, Model model) {
        Client client = new Client();
        client.setClientPassword(clientPassword);
        client.setAddress(address);
        client.setLogin(login);
        client.setName(clientName);
        client.setPhone(phone);
        clientRepo.save(client);
        model.addAttribute("client",client);
        return "list";
    }



}
