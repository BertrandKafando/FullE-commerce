package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cmd_id;
    @Temporal(TemporalType.DATE)
    private Date datecmd ;
    private Payement methode_pay;
    private boolean etat ;
    @ManyToOne
    private Client client;
    @ManyToMany
    List<Produit>produits=new ArrayList<>();
    @OneToMany(mappedBy = "commande")
    List<Commentaire>commentaires=new ArrayList<>();

    @ManyToOne()
    private  Adresse adresse;
}
