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

import fr.adaming.formation.bookstore.model.Livre;
import fr.adaming.formation.bookstore.service.ILivreService;

@RestController
@RequestMapping("livres")
@CrossOrigin("http://localhost:4200")
public class LivreController {
	
	@Autowired
	ILivreService livreService;
	
	@GetMapping
	public List<Livre> getAll(){
		return livreService.getAllLivre();
		
	}
	
	@GetMapping("{id}") //equivalent au /:id dans node, router.get/:id
	public Livre getOne(@PathVariable long id) {   //id rempli dans l'url par le webservice 
		return livreService.getOneLivre(id);		
	}
	
	@DeleteMapping("{id}")
	public void deleteLivre(@PathVariable long id) {
		 livreService.deleteLivre(id);
	}
	@DeleteMapping("delete2/{id}")
	public Boolean deleteById(@PathVariable long id) {
		 return livreService.deleteById(id);
	}
	
	@PostMapping()
	public Livre createLivre(@RequestBody Livre livre) {
		return livreService.saveLivre(livre);
	}
	
	@PutMapping("{id}")
	public Livre updateLivre(@RequestBody Livre livre, @PathVariable long id) {
		return livreService.saveLivre(livre);
	}

	@PutMapping("affecterAuteur/{idLivre}/{idAuteur}") //nommer la méthode car plusieurs chemins
	public Livre update(@PathVariable long idLivre, @PathVariable long idAuteur) {
		return livreService.affecterAuteur(idLivre, idAuteur);
		
	}
	@PutMapping("affecterCategorie/{idLivre}/{idCategorie}")
	public Livre updateCategorie(@PathVariable long idLivre, @PathVariable long idCategorie) {
		return livreService.affecterCategorie(idLivre, idCategorie);
		
	}
	@PutMapping("affecterEtagere/{idLivre}/{idEtagere}")
	public Livre updateEtagere(@PathVariable long idLivre, @PathVariable long idEtagere) {
		return livreService.affecterEtagere(idLivre, idEtagere);
		
	}
	@GetMapping("byAuteur/{idAuteur}") //nom de la méthode
	public List<Livre> findByAuteur(@PathVariable long idAuteur){
		return livreService.findByAuteur(idAuteur);
	}
	@GetMapping("byCategorie/{idCategorie}") //nom de la méthode
	public List<Livre> findByCategorie(@PathVariable long idCategorie){
		return livreService.findByCategorie(idCategorie);
	}
	@GetMapping("byEtagere/{idEtagere}") //nom de la méthode
	public List<Livre> findByEtagere(@PathVariable long idEtagere){
		return livreService.findByEtagere(idEtagere);
	}
}
