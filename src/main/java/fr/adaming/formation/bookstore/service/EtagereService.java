package fr.adaming.formation.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.repository.IEtagereRepository;

@Service
public class EtagereService implements IEtagereService{
	@Autowired 
	IEtagereRepository etagereRepository;

	@Override
	public Etagere saveEtagere(Etagere etagere) {
		return etagereRepository.save(etagere);
	}


	@Override
	public Etagere getOneEtagere(long id) {
		Optional<Etagere> EtagereOptional = etagereRepository.findById(id);
		Etagere etagere = new Etagere();
		if (EtagereOptional.isPresent()) {
			etagere = EtagereOptional.get();
			
		}
		
		return etagere;
	}

	@Override
	public void deleteEtagere(long id) {
		etagereRepository.deleteById(id);
		
	}

	@Override
	public List<Etagere> getAllEtagere() {
		// TODO Auto-generated method stub
		return  etagereRepository.findAll();
	}


	@Override
	public Boolean deleteById(long id) {
		try {
		      etagereRepository.deleteById(id); 
			} catch (Exception e) {
				return false;
			}
			return true;
			}

}
