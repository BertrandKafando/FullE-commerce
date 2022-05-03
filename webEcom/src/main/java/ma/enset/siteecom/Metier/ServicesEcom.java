package ma.enset.siteecom.Metier;

import ma.enset.siteecom.entities.Categorie;
import ma.enset.siteecom.entities.Commande;
import ma.enset.siteecom.entities.Produit;

public interface ServicesEcom {
    public Produit saveProd(Produit produit);
    public Categorie saveCat(Categorie categorie);

    public void addProduitToCategorie(Long id_prod,Long id_cat);

    public Commande saveCom(Commande commande);

}
