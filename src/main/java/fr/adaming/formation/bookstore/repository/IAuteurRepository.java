package fr.adaming.formation.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.bookstore.model.Auteur;

public interface IAuteurRepository extends JpaRepository<Auteur, Long>{

}
