package fr.adaming.formation.bookstore.service;

import java.util.List;

import fr.adaming.formation.bookstore.model.Etagere;



public interface IEtagereService {
	public Etagere saveEtagere(Etagere etagere); //le save fait le update et le create
	public Etagere getOneEtagere(long id);
	public void  deleteEtagere(long id);
	public List<Etagere> getAllEtagere();
	

}
