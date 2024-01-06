package com.koder.produits;

import com.koder.produits.model.Produit;
import com.koder.produits.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest

class ProduitsApplicationTests {

//    @Autowired
//    private ProduitRepository produitRepository;
//
//    @Test
//    public void testCreateProduit(){
//        Produit prod = new Produit("PC Dell",545.000,new Date());
//        produitRepository.save(prod);
//    }
//    @Test
//    public void testFindProduit(){
//        Produit p = produitRepository.findById(1L).get();
//        System.out.println(p);
//    }
//
//    @Test
//    public void testUpdateProduit(){
//        Produit p = produitRepository.findById(1L).get();
//        p.setPrix(1000.300);
//        produitRepository.save(p);
//        System.out.println(p);
//    }
//
//    @Test
//    public void testDeleteProduit(){
//        produitRepository.deleteById(1L);
//    }
//
//    @Test
//    public void testFindAllProduit(){
//        List <Produit> prods = produitRepository.findAll();
//
//        for (Produit p : prods)
//            System.out.println(p);
//    }

}
