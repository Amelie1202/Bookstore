package fr.adaming.formation.bookstore;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.adaming.formation.bookstore.model.Auteur;
import fr.adaming.formation.bookstore.model.Categorie;
import fr.adaming.formation.bookstore.model.Etagere;
import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.service.AuteurService;
import fr.adaming.formation.bookstore.service.IAuteurService;
import fr.adaming.formation.bookstore.service.ICategorieService;
import fr.adaming.formation.bookstore.service.IEtagereService;
import fr.adaming.formation.bookstore.service.ILivreService;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	ILivreService livreService;
	@Autowired
	IAuteurService auteurService;
	@Autowired
	ICategorieService categorieService;
	@Autowired
	IEtagereService etagereService;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
		
	}
	
	@Override
	public void run(String...args) throws Exception {
//		Livre l5 = new Livre();
//		l5.setTitre("Titre2");
//		l5.setIsbn("21255");
//	livreService.saveLivre(l5);
		
//		Auteur a3 = new Auteur();
//		a3.setNom("Hergé");
//		a3.setPrenom("Pierre");
//		auteurService.saveAuteur(a3);
		
//		Categorie c4 = new Categorie();
//		c4.setLibelle("Théâtre");
//		categorieService.saveCategorie(c4);
		
//		Etagere e4 = new Etagere();
//		e4.setLibelleEtagere("Etagere4");
//		etagereService.saveEtagere(e4);
////		
//		Livre livre = livreService.getOneLivre(7);
//		livre.setDateParution(new Date("1926/03/10"));
//		Auteur auteur = auteurService.getOneAuteur(3);
//		Categorie categorie = categorieService.getOneCategorie(3);
//		Etagere etagere = etagereService.getOneEtagere(3);
//		livre.setEtagere(etagere);
//		livre.setCategorie(categorie);
//		livre.setAuteur(auteur);
//		livreService.saveLivre(livre);
//		livreService.deleteLivre(8);
		
		
		System.err.println("c'est là");
	}
	

}
