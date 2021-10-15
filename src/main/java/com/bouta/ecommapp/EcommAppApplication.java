package com.bouta.ecommapp;

import com.bouta.ecommapp.dao.CategorieRepository;
import com.bouta.ecommapp.dao.ProduitRepository;
import com.bouta.ecommapp.entities.Categorie;
import com.bouta.ecommapp.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommAppApplication implements CommandLineRunner {

    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private ProduitRepository produitRepository;
    public static void main(String[] args) {
        SpringApplication.run(EcommAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      Categorie c1 = new Categorie(null,"Produits d'hygiéne et de toilette","categorie des Produits d'hygiénes et de toilette , tel que les démaquillants,déodorants,produits de rasage,etc",null);
      Categorie c2 = new Categorie(null,"produits d'entretien capillaires","categorie des produits d'entretien capillaires tel que les champoings,aprés-champoings,masques,etc ",null);
      Categorie c3 = new Categorie(null,"Produits de maquillage","categorie des produits de makeup tel que les poudres,fonds de teint,rouge a lévre, etc , ",null);
      Categorie c4 = new Categorie(null,"Parfums","categorie des parfums",null);
      categorieRepository.save(c1);
      categorieRepository.save(c2);
      categorieRepository.save(c3);
      categorieRepository.save(c4);

      Produit p1=new Produit(null,"Scandal",250.00,70,"",c4);
      Produit p2=new Produit(null,"Sauvage",270.00,50,"",c4);
      Produit p3=new Produit(null,"Guerlan",420.00,30,"",c4);
      Produit p4=new Produit(null,"Olympea",360.00,20,"",c4);
      Produit p5=new Produit(null,"Elie Saab",800.00,6,"",c4);
      Produit p6=new Produit(null,"Si",230.00,0,"",c4);
      Produit p7=new Produit(null,"Chloe",700.00,70,"",c4);
      produitRepository.save(p1);
      produitRepository.save(p2);
      produitRepository.save(p3);
      produitRepository.save(p4);
      produitRepository.save(p5);
      produitRepository.save(p6);
      produitRepository.save(p7);
    }
}
