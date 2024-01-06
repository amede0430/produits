package com.koder.produits.service;

import com.koder.produits.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduiById(Long id);
    Produit getProduit(Long id);
    List <Produit> getAllProduits();
}
