package fst.info.springhibernate.service;

import java.util.List;

import fst.info.springhibernate.model.*;
public interface InternauteBoutiqueMetier {
public List<Categorie> listCategories();
public Categorie getCategorie(Long idCat);
public List<Produit> listproduits();
public List<Produit> produitsParMotCle(String mc);
public List<Produit> produitsParCategorie(Long idCat);
public List<Produit> produitsSelectionnes();
public Produit getProduit(Long idP);
public Commande enregistrerCommande(Panier p,Client c);
}
