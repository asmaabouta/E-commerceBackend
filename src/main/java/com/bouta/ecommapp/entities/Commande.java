package com.bouta.ecommapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commande {
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long codeCmd;
    private Date dateCmd;
    @OneToMany
    private List<Produit> produits;
    @ManyToOne
    private User user;
}
