package fr.adaming.formation.bookstore.service;

import java.util.List;

import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.model.Utilisateur;



public interface IUtilisateurService {
	public Utilisateur saveUtilisateur(Utilisateur utilisateur); //le save fait le update et le create
	public Utilisateur getOneUtilisateur(long id);
	public Boolean deleteById(long id);
	public List<Utilisateur> getAllUtilisateur();
	public Utilisateur findByLogin(String login);
	
	
}
