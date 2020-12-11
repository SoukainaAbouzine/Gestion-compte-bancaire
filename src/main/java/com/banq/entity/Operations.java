package com.banq.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Operations")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYP_OPERATIONS",
discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Operations  implements Serializable{
	//Attributes
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeOperations ;
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name = "CODE_EMPLOYE")
	private Employe employe;
	@ManyToOne
	@JoinColumn(name = "CODE_COMPTE")
	private Compte comptes;
	  //Constrecteurs
	public Operations(Date dateOperation, double montant, Compte compte) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.comptes = compte;
	}
	
	public Operations(double montant, Compte comptes) {
		super();
		this.montant = montant;
		this.comptes = comptes;
	}

	public Operations(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public Operations() {
		super();
	}
	public Operations(Long codeOperations, Date dateOperation, double montant) {
		super();
		this.codeOperations = codeOperations;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	 //Getters&Setters
	public Long getCodeOperations() {
		return codeOperations;
	}
	public void setCodeOperations(Long codeOperations) {
		this.codeOperations = codeOperations;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Compte getCompte() {
		return comptes;
	}
	public void setCompte(Compte compte) {
		this.comptes = compte;
	}
	
	

}
