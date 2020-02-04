package fr.adaming.formation.bookstore.service;

import java.util.List;

import fr.adaming.formation.bookstore.model.Auteur;



public interface IAuteurService {
	public Auteur saveAuteur(Auteur auteur); 
	public Auteur getOneAuteur(long id);
	public void deleteAuteur(long id);
	public List<Auteur> getAllAuteur();

}
