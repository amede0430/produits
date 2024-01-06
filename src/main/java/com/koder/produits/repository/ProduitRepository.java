package com.koder.produits.repository;

import com.koder.produits.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository <Produit,Long> {

}
