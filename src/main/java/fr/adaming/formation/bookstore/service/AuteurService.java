package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Auteur;
import fr.adaming.formation.bookstore.repository.IAuteurRepository;


@Service
public class AuteurService implements IAuteurService{

	@Autowired 
	IAuteurRepository auteurRepository;
	@Override
	public Auteur saveAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		return auteurRepository.save(auteur);
	}

	@Override
	public Auteur getOneAuteur(long id) {
		Optional<Auteur> AuteurOptional = auteurRepository.findById(id);
		Auteur auteur = new Auteur();
		if (AuteurOptional.isPresent()) {
			auteur = AuteurOptional.get();
			
		}
		
		return auteur;
	}

	@Override
	public void deleteAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		auteurRepository.delete(auteur);
	}

	@Override
	public List<Auteur> getAllAuteur() {
		// TODO Auto-generated method stub
		return  auteurRepository.findAll();
	}
	

}
