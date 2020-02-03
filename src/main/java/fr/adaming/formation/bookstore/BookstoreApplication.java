package fr.adaming.formation.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.service.AuteurService;
import fr.adaming.formation.bookstore.service.ILivreService;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	ILivreService livreService;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
		
	}
	
	@Override
	public void run(String...args) throws Exception {
		Livre l1 = new Livre();
		l1.setTitre("Le Horla");
		livreService.saveLivre(l1);
		
		System.err.println("c'est là");
	}
	

}
