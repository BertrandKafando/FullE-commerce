package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prod_id;
    private String libelle;
    private String Marque ;
    private double prix;
    private String description;
    private double fraisExpedition;
    private boolean disponibilite;
    private int  qtestck ;
    private Date  date_pub;

    @OneToMany(mappedBy = "produit")
    List<Image>images=new ArrayList<>();
    @ManyToMany()
    List<Categorie>categories=new ArrayList<>();
    @ManyToMany()
    List<Promotion>promotions=new ArrayList<>();
    @ManyToMany
    List<Commande>commandes=new ArrayList<>();
    @OneToMany(mappedBy = "produit")
    List<Commentaire>commentaires=new ArrayList<>();
}
