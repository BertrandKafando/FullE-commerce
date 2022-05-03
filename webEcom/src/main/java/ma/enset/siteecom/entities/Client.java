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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id ;
    private String nom ;
    private String prenom ;
    private String email ;
    private String tel ;
    @Temporal(TemporalType.DATE)
    private Date regDate;
    private String login ;
    @OneToMany(mappedBy = "client")
    List<Commande>commandes=new ArrayList<>();
    @OneToOne
    Compte compte;
}
