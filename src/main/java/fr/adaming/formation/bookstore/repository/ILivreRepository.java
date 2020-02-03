package fr.adaming.formation.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.bookstore.model.Livre;

public interface ILivreRepository extends JpaRepository<Livre, Long>{

}
