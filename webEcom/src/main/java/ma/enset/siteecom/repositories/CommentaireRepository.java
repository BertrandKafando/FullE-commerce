package ma.enset.siteecom.repositories;

import ma.enset.siteecom.entities.Commentaire;
import ma.enset.siteecom.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {

}
