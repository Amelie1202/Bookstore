package fr.adaming.formation.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.adaming.formation.bookstore.model.Utilisateur;



public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

	public Utilisateur findByLogin(String login);
}
