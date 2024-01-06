package com.koder.produits.controller;

import com.koder.produits.model.User;
import com.koder.produits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ConnexionController {

    @Autowired
    UserService userService;
    @GetMapping("/connexion")
    public String login_page(){
        return "connexion";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password, Model model) {
        if(!userService.existEmail(email)){
            return "redirect:/connexion";
        }
        User user = userService.getByEmail(email);
        if(!user.getPassword().equals(password)){
            return "redirect:/connexion";
        }
        model.addAttribute("user",user);
        return "redirect:/produits";
    }
}
