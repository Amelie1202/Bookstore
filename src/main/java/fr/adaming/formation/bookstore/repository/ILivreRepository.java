package fr.adaming.formation.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.bookstore.model.Auteur;
import fr.adaming.formation.bookstore.model.Categorie;
import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.model.Utilisateur;

public interface ILivreRepository extends JpaRepository<Livre, Long>{
	
	public List<Livre> findByAuteur (Auteur auteur); //methode pour afficher les livres d'un auteur, préciser les attributs
	public List<Livre> findByCategorie (Categorie categorie);
	public List<Livre> findByEtagere (Etagere etagere);
	
}
