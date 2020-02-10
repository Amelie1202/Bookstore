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


import fr.adaming.formation.bookstore.model.Utilisateur;
import fr.adaming.formation.bookstore.service.IUtilisateurService;


@RestController
@RequestMapping("utilisateurs")
@CrossOrigin("http://localhost:4200")

public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;
	
	@GetMapping
	public List<Utilisateur> getAll(){
		return utilisateurService.getAllUtilisateur();
		
	}
	
	@GetMapping("{id}") //equivalent au /:id dans node, router.get/:id
	public Utilisateur getOne(@PathVariable long id) {   //id rempli dans l'url par le webservice 
		return utilisateurService.getOneUtilisateur(id);		
	}
	
	@DeleteMapping("delete2/{id}")
	public Boolean deleteById(@PathVariable long id) {
		 return utilisateurService.deleteById(id);
	}
	
	@PostMapping()
	public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	
	@PutMapping("{id}")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable long id) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}

}