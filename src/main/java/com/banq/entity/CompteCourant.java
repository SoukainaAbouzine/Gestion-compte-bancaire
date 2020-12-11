package com.banq.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COMPT_COURANT")
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{
        
   //Attributes
	private double decouvert;
 
	
        //Constructeurs
	public CompteCourant(String id, Date dateCreation, double solde, double decouvert) {
		super(id, dateCreation, solde);
		this.decouvert = decouvert;
	}

	public CompteCourant(String id, double solde,double decouvert) {
		super(id, solde);
		this.decouvert = decouvert;
		// TODO Auto-generated constructor stub
	}
	public CompteCourant(String id, Date dateCreation) {
		super(id, dateCreation);
		// TODO Auto-generated constructor stub
	}
  
	public CompteCourant(String id, Date dateCreation, double solde, Clients client, double decouvert) {
		super(id, dateCreation, solde, client);
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}

	//Getters&Stetters

	

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	
	

	
}
