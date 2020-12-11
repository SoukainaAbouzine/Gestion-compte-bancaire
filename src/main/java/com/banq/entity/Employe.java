package com.banq.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "EMPLOYE")
public class Employe implements Serializable{
	public Employe(String nameEmploye) {
		super();
		this.nameEmploye = nameEmploye;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeEmploye;
	private String nameEmploye;
	@OneToMany(mappedBy = "employe",fetch = FetchType.LAZY)
	
	private Collection<Compte> compte;
	public Long getCodeEmploye() {
		return codeEmploye;
	}
	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}
	public String getNameEmploye() {
		return nameEmploye;
	}
	public void setNameEmploye(String nameEmploye) {
		this.nameEmploye = nameEmploye;
	}
	public Collection<Compte> getCompte() {
		return compte;
	}
	public void setCompte(Collection<Compte> compte) {
		this.compte = compte;
	}
	public Collection<Operations> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operations> operations) {
		this.operations = operations;
	}
	public Employe() {
		super();
	}
	@OneToMany(mappedBy = "employe",fetch = FetchType.LAZY)
	private Collection<Operations> operations;

}
