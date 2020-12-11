package com.banq.metier;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banq.dao.CompteRepository;
import com.banq.entity.Compte;
@Service
public class CompteMetierImplements implements CompteMetier{
   @Autowired
	 private CompteRepository compteRepository;

	@Override
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		cp.setDateCreation(new Date());
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(String codeCompte) {
		// TODO Auto-generated method stub
		return compteRepository.getOne(codeCompte);
	}
}
