package fr.adaming.formation.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.formation.bookstore.model.Role;



public interface IRoleRepository extends JpaRepository<Role, Long>{

}
