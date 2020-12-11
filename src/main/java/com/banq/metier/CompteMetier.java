package com.banq.metier;

import com.banq.entity.Compte;

public interface CompteMetier {
	 public Compte saveCompte(Compte cp);
	 public Compte getCompte(String codeCompte);

}
