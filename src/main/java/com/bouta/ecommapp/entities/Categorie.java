package com.bouta.ecommapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeCate;
    private String nom;
    private String description;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

}
