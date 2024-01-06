package com.koder.produits.controller;

import com.koder.produits.model.User;
import com.koder.produits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class InscriptionController {

    @Autowired
    UserService userService;
    @GetMapping("/inscription")
    public String register_page(){
        return "inscription";
    }

    @PostMapping("/register")
    public String register(@RequestParam("nom") String nom,
                           @RequestParam("prenoms") String prenoms,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password) {
        if(userService.existEmail(email)){
            return "redirect:/inscription";
        }
        User user = new User(nom,prenoms,email,password,new Date());
        userService.saveUser(user);
        return "connexion";
    }
}
