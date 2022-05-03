package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Commentaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComm ;
    private String commentaire ;
    @Temporal(TemporalType.DATE)
    private Date date_pub;
    @ManyToOne
    private  Produit produit;
    @ManyToOne
    private Commande commande;
}
