package fr.adaming.formation.bookstore.controller;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.formation.bookstore.model.Token;
import fr.adaming.formation.bookstore.model.Utilisateur;
import fr.adaming.formation.bookstore.service.IUtilisateurService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


@RestController
@RequestMapping("utilisateurs")
@CrossOrigin("http://localhost:4200")

public class UtilisateurController {
	
	//instancer la clé pour le token
	Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	@Autowired
	IUtilisateurService utilisateurService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
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
		utilisateur.setMdp(bCryptPasswordEncoder.encode(utilisateur.getMdp())); //méthode de cryptage mdp
		System.out.println("ajout réussi");
		return utilisateurService.saveUtilisateur(utilisateur);
		
	}
	
	@PutMapping("{id}")
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable long id) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	
	@PostMapping("login") // chercher le login et comparer les mdp
	public Utilisateur login(@RequestBody Utilisateur utilisateur) {
		Utilisateur utilisateurCryptee = utilisateurService.findByLogin(utilisateur.getLogin());
		if(bCryptPasswordEncoder.matches(utilisateur.getMdp(), utilisateurCryptee.getMdp())) {
			return utilisateurCryptee;
		} else {
			return null;
		}
	}
	//méthode pour le token
	@PostMapping("authentif") // chercher le login et comparer les mdp
	public Token getTokenUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur utilisateurCryptee = utilisateurService.findByLogin(utilisateur.getLogin());
		if(utilisateurCryptee != null) {
		if(bCryptPasswordEncoder.matches(utilisateur.getMdp(), utilisateurCryptee.getMdp())) {
			Map<String, Object> claims = new HashMap<String,Object>();
			claims.put("idUtilisateur", utilisateurCryptee.getIdUtilisateur());
			claims.put("nom", utilisateurCryptee.getNom()); //claims pour recuperer les donnees de la base utilisateur
			claims.put("prenom", utilisateurCryptee.getPrenom());
			claims.put("email", utilisateurCryptee.getEmail());
			claims.put("login", utilisateurCryptee.getLogin());
			
			// respecter le Jwts car c est le nom de la biblio
			String jws = Jwts.builder().addClaims(claims).signWith(key).compact(); //builder pour construire un token, et une variables jws qui va contenir la chaine de caractere du token
			//add claims pour ajouter nos données, ajoute la clé (la signature) et le compact pour fermer le token
			Token t = new Token(); //declarer un token de type token, pour envoyer sous forme de JSON au webservice
			t.setToken(jws); //rempli de donnée
			return t; //retourne au webservice
		} 
	}
			return null;
		}
	}


