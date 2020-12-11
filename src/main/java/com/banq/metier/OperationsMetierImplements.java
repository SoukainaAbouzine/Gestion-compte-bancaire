
  package com.banq.metier;
  
  import java.util.Date; import java.util.Optional;
  
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import
  org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banq.dao.CompteRepository;
import com.banq.dao.EmployeRepository;
import
  com.banq.dao.OperationRepository; import com.banq.entity.Compte;
import com.banq.entity.CompteCourant;
import com.banq.entity.Employe;
import com.banq.entity.Operations;
import com.banq.entity.Retrait;
import com.banq.entity.Versement;
  
  @Service
  public class OperationsMetierImplements implements OperationsMetier{
  
     @Autowired private OperationRepository operationRepository;
     @Autowired private CompteRepository compteRepository;
     @Autowired private EmployeRepository employeRepository;
  
 
  
  @Override
  public Compte consulterCompte(String codeCompte) {
  
  Compte cp =compteRepository.findById(codeCompte).orElse(null);
     if(cp==null)throw new RuntimeException("Compte introuvable");
              return cp;
       }
  
  
  @Override
  @Transactional
	public boolean verser(String codeCompte, double montant,Long codeEmploye) {
		Compte cp=consulterCompte(codeCompte);
		Employe e =employeRepository.getOne(codeEmploye);
		Versement v= new Versement();
		v.setDateOperation( new Date());
		v.setMontant(montant);
		v.setCompte(cp);
		v.setEmploye(e);
		operationRepository.save(v);
		cp.setSolde(cp.getSolde()+montant);
		compteRepository.save(cp);
		return true;
	}
  
  
 
  
  @Override 
  @Transactional
  public boolean retirer(String codeCompte, double montant,Long codeEmploye) { 
	  Compte cp=consulterCompte(codeCompte);
		Employe e =employeRepository.getOne(codeEmploye);
		if(cp.getSolde()<montant)throw new RuntimeException("solde insufisant");
		Operations r= new Retrait();
		r.setDateOperation( new Date());
		r.setMontant(montant);
		r.setCompte(cp);
		r.setEmploye(e);
		operationRepository.save(r);
		cp.setSolde(cp.getSolde()- montant);
		compteRepository.save(cp);
		return true;
	}
  
  
  
  @Override
  public boolean verment(String codeCompte1, String codeCompte2, double montant,Long codeEmploye) { 
	  if(codeCompte1.equals(codeCompte2))throw new RuntimeException("impossible virement sur le meme compte!!!");
		retirer(codeCompte1, montant,codeEmploye);
		verser(codeCompte2, montant,codeEmploye);
		return true;
  
  }
	/*
	 * @Override public Page<Operations> listOperation(String codeCpt, int page, int
	 * size) { // TODO Auto-generated method stub PageRequest pageable =
	 * PageRequest.of(page, size); return
	 * operationRepository.listOperation(codeCpt,pageable); }
	 */
  
  }
 