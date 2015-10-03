package fst.info.springhibernate.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommande;
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@OneToMany
	@JoinColumn(name = "idCommande")
	private Collection<LigneCommande> ligneCommandes;
	// Getters et Setters
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	
	// Cosntructeur sans paramètre
	public Commande() {
		super();
	}
	// Cosntructeur avec paramètres
	public Commande(Long idCommande, Date dateCommande, Client client,
			Collection<LigneCommande> ligneCommandes) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
		this.ligneCommandes = ligneCommandes;
	}
	
}
