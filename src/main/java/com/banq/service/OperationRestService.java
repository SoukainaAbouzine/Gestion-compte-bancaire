package com.banq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banq.entity.Compte;
import com.banq.metier.OperationsMetier;

@RestController
public class OperationRestService {
	@Autowired
	private OperationsMetier operationMetier;
      @RequestMapping(value = "/operations",method = RequestMethod.GET)
	public Compte consulterCompte(@PathVariable String codeCompte) {
		return operationMetier.consulterCompte(codeCompte);
	}
 @RequestMapping(value = "/versements",method = RequestMethod.PUT)
	public boolean verser(@RequestParam String codeCompte,
			@RequestParam double montant,
			@RequestParam Long codeEmploye) {
		return operationMetier.verser(codeCompte, montant, codeEmploye);
	}
 @RequestMapping(value = "/retrait",method = RequestMethod.PUT)
	public boolean retirer(@RequestParam String codeCompte, 
			@RequestParam double montant,
			@RequestParam Long codeEmploye) {
		return operationMetier.retirer(codeCompte, montant, codeEmploye);
	}
 @RequestMapping(value = "/verment",method = RequestMethod.PUT)
	public void verment(@RequestParam String codeCompte1,
			@RequestParam String codeCompte2,
			@RequestParam double montant,@RequestParam Long codeEmploye) {
		operationMetier.verment(codeCompte1, codeCompte2, montant, codeEmploye);
	}

	
}
