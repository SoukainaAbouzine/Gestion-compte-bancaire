package com.banq.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpagne extends Compte{
	 
	//Attributs
	private double taux ;
 
	//Constrecteurs
	public CompteEpagne() {
		// TODO Auto-generated constructor stub
	}

	public CompteEpagne(String id, Date dateCreation) {
		super(id, dateCreation);
		// TODO Auto-generated constructor stub
	}
	
  public CompteEpagne(String id, double solde, double taux) {
		super(id, solde);
		this.taux = taux;
	}

public CompteEpagne(String id, Date dateCreation, double solde) {
	super(id, dateCreation, solde);
	// TODO Auto-generated constructor stub
}

public CompteEpagne(String id, Date dateCreation, double solde, Clients client, double taux) {
	super(id, dateCreation, solde, client);
	this.taux = taux;
}

public CompteEpagne(String id, double solde) {
	super(id, solde);
	// TODO Auto-generated constructor stub
}

	//Getters&Setters
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	

}
