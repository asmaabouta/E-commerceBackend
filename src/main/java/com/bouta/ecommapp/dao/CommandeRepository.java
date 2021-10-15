package com.bouta.ecommapp.dao;

import com.bouta.ecommapp.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
