package fr.adaming.formation.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.bookstore.model.Categorie;

public interface ICategorieRepository extends JpaRepository<Categorie, Long>{

}
