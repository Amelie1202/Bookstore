package fr.adaming.formation.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_livre")

public class Livre {

	private long idLivre;

	private String isbn;

	private String titre;

	private Auteur auteur;

	private Date dateParution;

	private Categorie categorie;

	private Etagere etagere;

	public Livre() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_livre")
	public long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(long idLivre) {
		this.idLivre = idLivre;
	}

	@Column(name = "isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name = "titre")
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	

	@Column(name = "date_parution")
	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	

	@ManyToOne
	@JoinColumn(name = "id_etagere")
	public Etagere getEtagere() {
		return etagere;
	}

	public void setEtagere(Etagere etagere) {
		this.etagere = etagere;
	}

	public Livre(String isbn, String titre, Auteur auteur, Date dateParution, Categorie categorie, Etagere etagere) {
		super();
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.dateParution = dateParution;
		this.categorie = categorie;
		this.etagere = etagere;
	}

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", isbn=" + isbn + ", titre=" + titre + ", auteur=" + auteur
				+ ", dateParution=" + dateParution + ", categorie=" + categorie + ", etagere=" + etagere + "]";
	}

	@ManyToOne
	@JoinColumn(name = "id_auteur")
	public Auteur getAuteur() {
		return auteur;
	}
	@ManyToOne
	@JoinColumn(name = "id_categorie")
	public Categorie getCategorie() {
		return categorie;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	

}