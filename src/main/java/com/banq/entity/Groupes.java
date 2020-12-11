package com.banq.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "GROUPES")
public class Groupes implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeGroupes;
	private String nomGroupes;
	@ManyToMany
	@JoinTable(name = "GROUP_EMPLOYER")
	private Collection<Employe> employe;
	public Long getCodeGroupes() {
		return codeGroupes;
	}
	public void setCodeGroupes(Long codeGroupes) {
		this.codeGroupes = codeGroupes;
	}
	public String getNomGroupes() {
		return nomGroupes;
	}
	public void setNomGroupes(String nomGroupes) {
		this.nomGroupes = nomGroupes;
	}
	public Collection<Employe> getEmploye() {
		return employe;
	}
	public void setEmploye(Collection<Employe> employe) {
		this.employe = employe;
	}
	public Groupes() {
		super();
	}
	public Groupes(Long codeGroupes, String nomGroupes) {
		super();
		this.codeGroupes = codeGroupes;
		this.nomGroupes = nomGroupes;
	}

}
