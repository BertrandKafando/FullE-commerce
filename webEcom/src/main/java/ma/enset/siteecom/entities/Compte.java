package ma.enset.siteecom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id
    private String login ;
    private String  mdp ;
   private String role;
   private String question ;
   private String reponse;
   @Temporal(TemporalType.DATE)
   private Date date_creation ;
   @OneToOne
   private Client client;
}
