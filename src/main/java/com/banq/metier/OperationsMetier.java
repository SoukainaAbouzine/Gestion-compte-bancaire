package com.banq.metier;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.banq.entity.Compte;
import com.banq.entity.Operations;

public interface OperationsMetier {
	 public Compte consulterCompte(String codeCompte);
	 public boolean  verser (String codeCompte,double montant,Long codeEmploye);
	 public boolean retirer(String codeCompte,double montant,Long codeEmploye);
	 public boolean verment(String codeCompte1,String codeCompte2,double montant,Long codeEmploye);
	 //public Page<Operations> listOperation(String codeCpt,int page, int size);
     
}
