package fr.adaming.formation.bookstore.service;

import java.util.List;

import fr.adaming.formation.bookstore.model.Livre;


public interface ILivreService {

	public Livre saveLivre(Livre livre); //le save fait le update et le create
	public Livre getOneLivre(long id);
	public void  deleteLivre(long id);
	public List<Livre> getAllLivre();
	
}
