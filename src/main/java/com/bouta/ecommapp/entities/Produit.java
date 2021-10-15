package com.bouta.ecommapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codePr;
    private String nom;
    private Double prix;
    private int quantite;
    private String image;
    @ManyToOne
    private Categorie categorie;



}
