package com.banq.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("OV")
public class Versement extends Operations {

	public Versement() {
		// TODO Auto-generated constructor stub
	}

	public Versement(Long codeOperations, Date dateOperation, double montant) {
		super(codeOperations, dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

}
