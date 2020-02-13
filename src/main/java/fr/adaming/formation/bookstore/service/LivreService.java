package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Auteur;
import fr.adaming.formation.bookstore.model.Categorie;
import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.model.Utilisateur;
import fr.adaming.formation.bookstore.repository.IAuteurRepository;
import fr.adaming.formation.bookstore.repository.ICategorieRepository;
import fr.adaming.formation.bookstore.repository.IEtagereRepository;
import fr.adaming.formation.bookstore.repository.ILivreRepository;
import fr.adaming.formation.bookstore.repository.IUtilisateurRepository;

@Service
public class LivreService implements ILivreService{

	@Autowired // leguer cette instance à spring, relier
	ILivreRepository livreRepository;
	@Autowired 
	IAuteurRepository auteurRepository;
	@Autowired 
	ICategorieRepository categorieRepository;
	@Autowired 
	IEtagereRepository etagereRepository;
	@Autowired 
	IUtilisateurRepository utilisateurRepository;
	
	@Override
	public Livre saveLivre(Livre livre) {
		// TODO Auto-generated method stub
		return livreRepository.save(livre);
	}

	@Override
	public Livre getOneLivre(long id) {
		Optional<Livre> livreOptional = livreRepository.findById(id);
		Livre livre = new Livre();
		if (livreOptional.isPresent()) {
			livre = livreOptional.get();
			
		}
		
		return livre;
	}



	@Override
	public void deleteLivre(long id) {
      livreRepository.deleteById(id);
	}

	

	@Override
	public List<Livre> getAllLivre() {
		// TODO Auto-generated method stub
		return  livreRepository.findAll(); //retourne un optional, un autre type d'objet si rien on retourne un objet vide
	}

	@Override
	public Livre affecterAuteur(long idLivre, long idAuteur) {
		Optional<Livre> livreOptional = livreRepository.findById(idLivre); //chercher le livre pour affecter un auteur
		Optional<Auteur> auteurOptional = auteurRepository.findById(idAuteur);
		Livre livre = new Livre();
		Auteur auteur= new Auteur();
		if (livreOptional.isPresent()& auteurOptional.isPresent()) { //chercher si ils existent
			livre = livreOptional.get();
			auteur= auteurOptional.get();
			livre.setAuteur(auteur); //associer l'auteur
		}
		
		return livreRepository.save(livre); //enregistrer sur la base
	}

	@Override
	public Livre affecterCategorie(long idLivre, long idCategorie) {
		Optional<Livre> livreOptional = livreRepository.findById(idLivre);
		Optional<Categorie> categorieOptional = categorieRepository.findById(idCategorie);
		Livre livre = new Livre();
		Categorie categorie= new Categorie();
		if (livreOptional.isPresent()& categorieOptional.isPresent()) {
			livre = livreOptional.get();
			categorie= categorieOptional.get();
			livre.setCategorie(categorie);
		}
		
		return livreRepository.save(livre);
	}

	@Override
	public Livre affecterEtagere(long idLivre, long idEtagere) {
		Optional<Livre> livreOptional = livreRepository.findById(idLivre); 
		Optional<Etagere> etagereOptional = etagereRepository.findById(idEtagere);
		Livre livre = new Livre();
		Etagere etagere= new Etagere();
		if (livreOptional.isPresent()& etagereOptional.isPresent()) {
			livre = livreOptional.get();
			etagere= etagereOptional.get();
			livre.setEtagere(etagere);
		}
		
		return livreRepository.save(livre);

}

	@Override
	public Boolean deleteById(long id) {
		try {
		      livreRepository.deleteById(id); 
			} catch (Exception e) {
				return false;
			}
			return true;
			}

	@Override
	public List<Livre> findByAuteur(long idAuteur) {
		Auteur auteur = auteurRepository.findById(idAuteur).get();		//ici on précise qu'on recherche par l'id Auteur car c'est un objet
		return livreRepository.findByAuteur(auteur);
	}

	@Override
	public List<Livre> findByCategorie(long idCategorie) {
		Categorie categorie = categorieRepository.findById(idCategorie).get();		
		return livreRepository.findByCategorie(categorie);
	}

	@Override
	public List<Livre> findByEtagere(long idEtagere) {
		Etagere etagere = etagereRepository.findById(idEtagere).get();		
		return livreRepository.findByEtagere(etagere);
	}

	@Override
	public Livre affecterUtilisateur(long idLivre, long idUtilisateur) {
	Optional<Livre> livreOptional = livreRepository.findById(idLivre); 
	Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(idUtilisateur);
	Livre livre = new Livre();
	Utilisateur utilisateur= new Utilisateur();
	if (livreOptional.isPresent()& utilisateurOptional.isPresent()) {
		livre = livreOptional.get();
		utilisateur= utilisateurOptional.get();
		livre.setUtilisateur(utilisateur);
	}
	
	return livreRepository.save(livre);

	}
}
