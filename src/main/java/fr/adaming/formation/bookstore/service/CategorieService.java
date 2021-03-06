package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Categorie;

import fr.adaming.formation.bookstore.repository.ICategorieRepository;

@Service
public class CategorieService implements ICategorieService{
	
	@Autowired 
	ICategorieRepository categorieRepository;

	@Override
	public Categorie saveCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}

	@Override
	public Categorie getOneCategorie(long id) {
		Optional<Categorie> CategorieOptional = categorieRepository.findById(id);
		Categorie categorie = new Categorie();
		if (CategorieOptional.isPresent()) {
			categorie = CategorieOptional.get();
			
		}
		
		return categorie;
	}
	@Override
	public void deleteCategorie(long id) {
		categorieRepository.deleteById(id);
	}

	@Override
	public List<Categorie> getAllCategorie() {
		// TODO Auto-generated method stub
		return  categorieRepository.findAll();
	}

	@Override
	public Boolean deleteById(long id) {
		try {
		      categorieRepository.deleteById(id); 
			} catch (Exception e) {
				return false;
			}
			return true;
			}
	}

	


