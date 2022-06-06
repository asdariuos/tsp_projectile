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
    /*private ClientRepo clientRepo;
    private OrderRepo orderRepo;
    private ProductRepo productRepo;

    private AuthorRepo authorRepo;

    private GenreRepo genreRepo;

    private PublicationRepo publicationRepo;
    @Autowired
    AdminMenuController(
            ClientRepo clientRepo,
            OrderRepo orderRepo,
            ProductRepo productRepo,
            AuthorRepo authorRepo,
            GenreRepo genreRepo,
            PublicationRepo publicationRepo
    ){
        this.clientRepo=clientRepo;
        this.orderRepo=orderRepo;
        this.productRepo=productRepo;
        this.authorRepo=authorRepo;
        this.genreRepo=genreRepo;
        this.publicationRepo=publicationRepo;
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
                             @RequestParam(name = "Author_id") int Author_id,
                             @RequestParam(name = "Genre_id") int Genre_id,
                             @RequestParam(name = "Publication_id") int Publication_id,
                             @RequestParam(name = "Description") String Description,
                             @RequestParam(name = "Price") int Price,
                             @RequestParam(name = "Amount") int Amount,
                             @RequestParam(name = "IMG_path") String IMG_path,
                             Model model) {
        Product product = new Product();
        Author author = new Author();
        Genre genre = new Genre();
        Publication publication = new Publication();
        if (productRepo.existsByAuthor_idAndGenre_idAndPublication_id(Author_id,Genre_id,Publication_id))
            return "admin/addproduct";

        return "admin/addproduct";


    }









  */
}
