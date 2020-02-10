package fr.adaming.formation.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.bookstore.model.Utilisateur;



public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
