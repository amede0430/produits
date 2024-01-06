package com.koder.produits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class ProduitsApplication {


    @GetMapping
    @RequestMapping("/")
    public String home() {
        return "Hello World! Yes <br> C'est Florian Ktm";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProduitsApplication.class, args);
    }

}
