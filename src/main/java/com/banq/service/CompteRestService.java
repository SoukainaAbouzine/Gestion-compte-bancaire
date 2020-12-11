
  package com.banq.service;
  
  
  
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute; 
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping; 
  import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
  import com.banq.entity.Compte;
  import com.banq.metier.CompteMetier;
  
  @RestController
  public class CompteRestService {
  
  @Autowired 
  private CompteMetier compteMetier;
  @PostMapping(value = "/comptes") 
  public Compte saveCompte(@RequestBody Compte cp) {
	  return compteMetier.saveCompte(cp); 
	  }
  
  
  
  
  @RequestMapping(value = "/comptes/{code}",method = RequestMethod.GET)
  public Compte getCompte(@PathVariable String codeCompte) {
	  return compteMetier.getCompte(codeCompte);
	  }
  
  }
 