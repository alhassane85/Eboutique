package fst.info.springhibernate.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class LigneCommande implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "idproduit")
	private Produit produit;
	private int quantite;
	private double prix;
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	// Cosntructeur sans paramètre
	public LigneCommande() {
		super();
	}
	// Cosntructeur avec paramètres
	public LigneCommande(Long id, Produit produit, int quantite, double prix) {
		super();
		this.id = id;
		this.produit = produit;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	
	
}
