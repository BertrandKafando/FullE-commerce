package ma.enset.siteecom.repositories;

import ma.enset.siteecom.entities.Produit;
import ma.enset.siteecom.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PromotionRepository extends JpaRepository<Promotion,Long> {

}
