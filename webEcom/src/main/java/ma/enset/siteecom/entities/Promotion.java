package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Promotion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprom ;
    @Temporal(TemporalType.DATE)
    private Date date_debut ;
    @Temporal(TemporalType.DATE)
    private Date date_fin ;
    private double  taux ;
    @ManyToMany
    List<Produit>produits=new ArrayList<>();
}
