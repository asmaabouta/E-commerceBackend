package com.bouta.ecommapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long codeUsr;
    @Column(unique = true)
    private String email;
    private String password;
    private String nom;
    private String type;
    @OneToMany(mappedBy = "user")
    private List<Commande> commandes;

}
