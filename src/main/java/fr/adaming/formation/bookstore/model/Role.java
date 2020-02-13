package fr.adaming.formation.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role {
	
	
	private long idRole;
	private String libelleRole;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_role")
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	@Column(name="libelle_role")
	public String getLibelleRole() {
		return libelleRole;
	}
	public void setLibelleRole(String libelleRole) {
		this.libelleRole = libelleRole;
	}
	public Role(String libelleRole) {
		super();
	
		this.libelleRole = libelleRole;
	}
	
	public Role() {}
	@Override
	public String toString() {
		return "Role [libelleRole=" + libelleRole + "]";
	}
	
	

}
