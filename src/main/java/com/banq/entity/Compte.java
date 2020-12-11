package com.banq.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
@Entity
@Table(name = "COMPT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYP_COMPT",
discriminatorType = DiscriminatorType.STRING,length = 2)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,property = "Type")
@JsonSubTypes({
	 @Type(name = "CC",value = CompteCourant.class),
	 @Type(name = "CE",value = CompteEpagne.class)
})
public abstract class Compte implements Serializable {
	            //Attribute
	@Id 
	private String id;
	private Date dateCreation;
	private double solde ;
	 
	
	//@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "codeclient")
	
	private Clients client;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CodeEmploye")

	private Employe employe;
	@OneToMany(mappedBy = "comptes")
	private Collection<Operations> operations;
	
	     //Constructeurs
	public Compte(String id, double solde) {
		super();
		this.id = id;
		this.solde = solde;
	}
	public Compte(String id, Date dateCreation, double solde) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	
	
	     public Compte(String id, Date dateCreation, double solde, Clients client) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}
		//getters & Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
    
	public Clients getClient() {
		return client;
	}
	public void setClient(Clients client) {
		this.client = client;
	}


	
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
  @JsonIgnore
	public Collection<Operations> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operations> operations) {
		this.operations = operations;
	}
	public Compte() {
		super();
	}
	public Compte(String id, Date dateCreation) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
	}
	

}
