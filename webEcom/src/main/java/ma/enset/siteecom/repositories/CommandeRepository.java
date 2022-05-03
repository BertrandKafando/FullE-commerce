package ma.enset.siteecom.repositories;

import ma.enset.siteecom.entities.Commande;
import ma.enset.siteecom.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande,Long> {

}
