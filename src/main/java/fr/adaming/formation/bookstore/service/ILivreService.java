package fr.adaming.formation.bookstore.service;

import java.util.List;

import fr.adaming.formation.bookstore.model.Categorie;
import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.model.Livre;


public interface ILivreService {

	public Livre saveLivre(Livre livre); //le save fait le update et le create
	public Livre getOneLivre(long id);
	public void  deleteLivre(long id);
	public List<Livre> getAllLivre();
	public Livre affecterAuteur(long idLivre, long idAuteur);
	public Livre affecterCategorie(long idLivre, long idCategorie);
	public Livre affecterEtagere(long idLivre, long idEtagere);
	public Boolean deleteById(long id);
	public List<Livre> findByAuteur(long idAuteur);
	public List<Livre> findByCategorie (long idCategorie);
	public List<Livre> findByEtagere (long idEtagere);
	
	
	
}
