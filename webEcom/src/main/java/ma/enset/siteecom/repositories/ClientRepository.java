package ma.enset.siteecom.repositories;

import ma.enset.siteecom.entities.Client;
import ma.enset.siteecom.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {

}
