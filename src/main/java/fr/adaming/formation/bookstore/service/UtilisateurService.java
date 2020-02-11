package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.model.Utilisateur;
import fr.adaming.formation.bookstore.repository.IAuteurRepository;
import fr.adaming.formation.bookstore.repository.ICategorieRepository;
import fr.adaming.formation.bookstore.repository.IEtagereRepository;
import fr.adaming.formation.bookstore.repository.ILivreRepository;
import fr.adaming.formation.bookstore.repository.IUtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService{
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
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Utilisateur getOneUtilisateur(long id) {
		Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(id);
		Utilisateur utilisateur = new Utilisateur();
		if (utilisateurOptional.isPresent()) {
			utilisateur = utilisateurOptional.get();
			
		}
		
		return utilisateur;
		
	}

	@Override
	public Boolean deleteById(long id) {
		try {
		      utilisateurRepository.deleteById(id); 
			} catch (Exception e) {
				return false;
			}
			return true;
			}

	@Override
	public List<Utilisateur> getAllUtilisateur() {
		return  utilisateurRepository.findAll(); 
	}

	@Override
	public Utilisateur findByLogin(String login) {		
		return utilisateurRepository.findByLogin(login);
	}

}
