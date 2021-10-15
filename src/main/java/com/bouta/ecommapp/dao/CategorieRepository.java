package com.bouta.ecommapp.dao;

import com.bouta.ecommapp.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository  extends JpaRepository<Categorie, Long> {
}
