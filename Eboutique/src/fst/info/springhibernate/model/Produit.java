package fst.info.springhibernate.model;

import java.io.Serializable; 
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Produit implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idProduit;
@NotEmpty
private String designation;
 private String description;
private double prix;
 private String photo;
private int quantite;
 private boolean selectionne;
@ManyToOne
@JoinColumn(name="ID_CAT")
private Categorie categorie;
// Getters et Setters
public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public boolean isSelectionne() {
	return selectionne;
}
public void setSelectionne(boolean selectionne) {
	this.selectionne = selectionne;
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
//Cosntructeur sans paramètre
public Produit() {
	super();
}
//Cosntructeur avec paramètres

public Produit(Long idProduit, String designation, String description,
		double prix, String photo, int quantite, boolean selectionne,
		Categorie categorie) {
	super();
	this.idProduit = idProduit;
	this.designation = designation;
	this.description = description;
	this.prix = prix;
	this.photo = photo;
	this.quantite = quantite;
	this.selectionne = selectionne;
	this.categorie = categorie;
}




}
