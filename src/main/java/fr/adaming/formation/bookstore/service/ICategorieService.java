package fr.adaming.formation.bookstore.service;

import java.util.List;


import fr.adaming.formation.bookstore.model.Categorie;


public interface ICategorieService {
	public Categorie saveCategorie(Categorie categorie); 
	public Categorie getOneCategorie(long id);
	public void deleteCategorie(long id);
	public List<Categorie> getAllCategorie();
	public Boolean deleteById(long id);
	

}
