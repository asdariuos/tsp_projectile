package com.example.tsp_projectile.controllers;

import com.example.tsp_projectile.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ClientMenuController {

    public static class FormParams{
        public static final String ID    = "id";
    }

    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/clientmenu")
    public String clientmenu(@RequestParam(value = FormParams.ID, required = false) Integer id, Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("id", id);
        return "client/clientmenu";
    }

    @GetMapping("/kart")
    public String kart(@RequestParam(value = FormParams.ID, required = false) Integer id,Model model) {
        model.addAttribute("title", "Корзина");
        return "client/kart";
    }

    @GetMapping("/clientorders")
    public String clientorders(@RequestParam(value = FormParams.ID, required = false) Integer id,Model model) {
        model.addAttribute("title", "Заказы");
        return "client/clientorders";
    }




}
