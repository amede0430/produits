package com.koder.produits.controller;

import com.koder.produits.ProduitsApplication;
import com.koder.produits.model.Produit;
import com.koder.produits.service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService){
        this.produitService = produitService;
    }

    @GetMapping("/produits")
    public String listProduits(Model model){
        List<Produit> produits = produitService.getAllProduits();
        model.addAttribute("produits",produits);
        return "list-produits";
    }

    @PostMapping("/produit")
    public String addProduit(@RequestParam("nom") String nom,
                             @RequestParam("prix") String prixString) {
        Double prix = null;
        try {
            prix = Double.valueOf(prixString);
        } catch (NumberFormatException e) {
            return "redirect:/produits";
        }

        Produit p = new Produit(nom,prix,new Date());
        produitService.saveProduit(p);
        return "redirect:/produits";
    }
    @PostMapping("/produit/{id}")
    public String updateProduit(@RequestParam("nom") String nom,
                                @RequestParam("prix") String prixString,
                                @PathVariable Long id){
        Double prix = null;
        try {
            prix = Double.valueOf(prixString);
        } catch (NumberFormatException e) {
            return "redirect:/produits";
        }
        Produit p = produitService.getProduit(id);
        p.setNom(nom);
        p.setPrix(prix);
        produitService.saveProduit(p);
        return  "redirect:/produits";
    }

    @GetMapping("/delete-produit/{id}")
    public  String deleteProduit(@PathVariable Long id){
        produitService.deleteProduiById(id);
        return  "redirect:/produits";
    }

    @GetMapping("/unproduit/{id}")
    @ResponseBody
    public Produit getProduit(@PathVariable Long id){
        return  produitService.getProduit(id);
    }
}
