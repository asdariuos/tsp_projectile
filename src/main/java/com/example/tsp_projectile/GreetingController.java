package com.example.tsp_projectile;

import com.example.tsp_projectile.domain.AdminRepo;
import com.example.tsp_projectile.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

//sss
@Controller
public class GreetingController {
    @Autowired
    private AdminRepo adminRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Stranger") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting.mustache";
    }

    @GetMapping
    public String main(Map<String,Object> model) {
        Iterable< Admin > admins = adminRepo.findAll();
        model.put("admins", admins);
        return "main.mustache";
    }

@PostMapping
    public String add(@RequestParam String text,@RequestParam String tag, Map<String,Object> model){
        new Admin();
        return "main.mustache";
}


}