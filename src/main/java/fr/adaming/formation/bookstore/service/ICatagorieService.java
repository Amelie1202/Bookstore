package fr.adaming.formation.bookstore.service;

import java.util.List;


import fr.adaming.formation.bookstore.model.Categorie;


public interface ICatagorieService {
	public Categorie saveCategorie(Categorie categorie); 
	public Categorie getOneCategorie(long id);
	public void deleteCategorie(Categorie categorie);
	public List<Categorie> getAllCategorie();
	

}
