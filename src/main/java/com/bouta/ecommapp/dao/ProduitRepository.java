package com.bouta.ecommapp.dao;

import com.bouta.ecommapp.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
