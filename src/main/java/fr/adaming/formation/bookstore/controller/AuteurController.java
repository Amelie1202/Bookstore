package fr.adaming.formation.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.formation.bookstore.model.Auteur;
import fr.adaming.formation.bookstore.service.IAuteurService;



@RestController
@RequestMapping("auteurs")
@CrossOrigin("http://localhost:4200")
public class AuteurController {
	@Autowired
	IAuteurService auteurService;
	
	@GetMapping
	public List<Auteur> getAll(){
		return auteurService.getAllAuteur();
		
	}
	
	@GetMapping("{id}") //equivalent au /:id dans node, router.get/:id
	public Auteur getOne(@PathVariable long id) {   //id rempli dans l'url par le webservice 
		return auteurService.getOneAuteur(id);		
	}
	
	@DeleteMapping("{id}")
	public void deleteAuteur(@PathVariable long id) {
		 auteurService.deleteAuteur(id);
	}
	
	@PostMapping()
	public Auteur createLivre(@RequestBody Auteur auteur) {
		return auteurService.saveAuteur(auteur);
	}
	
	@PutMapping("{id}")
	public Auteur updateAuteur(@RequestBody Auteur auteur, @PathVariable long id) {
		return auteurService.saveAuteur(auteur);
	}

}
