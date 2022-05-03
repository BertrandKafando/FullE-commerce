package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data  @AllArgsConstructor @NoArgsConstructor
public class Image {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_img;
    private String url ;
    private boolean isprincipal;
    @ManyToOne
    private  Produit produit;
}
