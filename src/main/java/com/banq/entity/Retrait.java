package com.banq.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("OP")
public class Retrait extends Operations {
	public Retrait(Long codeOperations, Date dateOperation, double montant) {
		super(codeOperations, dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	private double solde;

	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Retrait(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

	public Retrait() {
		// TODO Auto-generated constructor stub
	}

	public Retrait(double solde) {
		super();
		this.solde = solde;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	

}
