package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Adresse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_add;
    private String addresse;
    private String ville;
    private int codepostale ;
    private String pays;
    @OneToMany(mappedBy = "adresse")
    List<Commande>commandes=new ArrayList<>();
}
