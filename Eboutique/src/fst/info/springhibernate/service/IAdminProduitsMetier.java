package fst.info.springhibernate.service;

import fst.info.springhibernate.model.*;

public interface IAdminProduitsMetier extends InternauteBoutiqueMetier {
	public Long ajouterProduit(Produit p, Long idCat);

	public void supprimerProduit(Long idP);

	public void modifierProduit(Produit p);
}
