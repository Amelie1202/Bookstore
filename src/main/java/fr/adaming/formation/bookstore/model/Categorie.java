package fr.adaming.formation.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_categorie")
public class Categorie {
	

	private long idCategorie;
	
	private String libelleCategorie;
	
	public Categorie() {}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categorie")
	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	  @Column(name="libelle_categorie")
	public String getLibelle() {
		return libelleCategorie;
	}

	public void setLibelle(String libelle) {
		this.libelleCategorie = libelle;
	}

	public Categorie(String libelleCategorie) {
		super();
		this.libelleCategorie = libelleCategorie;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", libelleCategorie=" + libelleCategorie + "]";
	}
	
	

}
