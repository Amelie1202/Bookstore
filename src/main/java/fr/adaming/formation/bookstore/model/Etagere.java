package fr.adaming.formation.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_etagere")
public class Etagere {
	
	
	private long idEtagere;
	
	private String libelleEtagere;
	
	public Etagere() {}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_etagere")
	public long getIdEtagere() {
		return idEtagere;
	}

	public void setIdEtagere(long idEtagere) {
		this.idEtagere = idEtagere;
	}

	  @Column(name="libelle_etagere")
	public String getLibelleEtagere() {
		return libelleEtagere;
	}

	public void setLibelleEtagere(String libelleEtagere) {
		this.libelleEtagere = libelleEtagere;
	}

	public Etagere(String libelleEtagere) {
		super();
		this.libelleEtagere = libelleEtagere;
	}

	@Override
	public String toString() {
		return "Etagere [idEtagere=" + idEtagere + ", libelleEtagere=" + libelleEtagere + "]";
	}

	
}
