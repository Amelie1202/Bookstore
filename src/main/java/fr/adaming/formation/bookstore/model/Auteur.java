package fr.adaming.formation.bookstore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_auteur")
public class Auteur  {
 
	


	private long idAuteur;
	
	private String nom;
	 
	private String prenom;
	
	public Auteur () {}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_auteur")
	public long getIdAuteur() {
		return idAuteur;
	}

	public void setIdAuteur(long idAuteur) {
		this.idAuteur = idAuteur;
	}

	  @Column(name="nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name="prenom")
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	public Auteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Auteur [idAuteur=" + idAuteur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
