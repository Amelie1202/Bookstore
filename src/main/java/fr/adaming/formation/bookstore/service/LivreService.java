package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.repository.ILivreRepository;

@Service
public class LivreService implements ILivreService{

	@Autowired // leguer cette instance à spring, relier
	ILivreRepository livreRepository;
	
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
	public void deleteLivre(Livre livre) {
		// TODO Auto-generated method stub
      livreRepository.delete(livre); 
	}

	@Override
	public List<Livre> getAllLivre() {
		// TODO Auto-generated method stub
		return  livreRepository.findAll(); //retourne un optional, un autre type d'objet si rien on retourne un objet vide
	}

}
