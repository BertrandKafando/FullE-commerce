package ma.enset.siteecom;

import ma.enset.siteecom.entities.Categorie;
import ma.enset.siteecom.entities.Client;
import ma.enset.siteecom.entities.Commande;
import ma.enset.siteecom.entities.Produit;
import ma.enset.siteecom.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SiteEcomApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiteEcomApplication.class, args);
    }

 @Bean
    CommandLineRunner commandLineRunner(
           ProduitRepository produitRepository,
           CategoryRepository categoryRepository,
           CommandeRepository  commandeRepository,
           AdresseRepository  adresseRepository,
           ClientRepository clientRepository,
           ImageRepository imageRepository,
           PromotionRepository promotionRepository,
           CommentaireRepository commentaireRepository,
           CompteRepository compteRepository
 ){
        return args -> {
            Stream.of("Lastest","Homme","Femme","Enfants").forEach(cat->{
                Categorie categorie=new Categorie();
                categorie.setLibelle(cat);
                categoryRepository.save(categorie);
            });

            categoryRepository.findAll().forEach(cat->{
                for(int i=1;i<5;i++){
                    Produit produit=new Produit();
                    produit.setLibelle(cat.getLibelle()+i);
                    produit.setPrix(Math.random()*2000);
                    produit.setMarque("BKC");
                    produit.setQtestck((int)Math.random()*20);
                    produitRepository.save(produit);
                    cat.setProduits(produitRepository.findAll());
                    categoryRepository.save(cat);
                }
            });


            Stream.of("Bertrand","cecile").forEach(p->{
                Client client=new Client();
                client.setNom(p);
                client.setTel("06");
                clientRepository.save(client);
            });

            Commande commande=new Commande();
            commande.setClient(clientRepository.findAll().get(0));
            commande.setDatecmd(new Date());
            commande.setEtat(false);
            List<Produit>produits=produitRepository.findAll();
            commande.setProduits(produits);
            commandeRepository.save(commande);


        };
    }
}
