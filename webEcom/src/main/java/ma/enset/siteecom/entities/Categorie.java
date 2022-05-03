package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Categorie  {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long cat_id;
    private String libelle;
    private String description;
    @ManyToMany()
    List<Produit>produits=new ArrayList<>();
}
