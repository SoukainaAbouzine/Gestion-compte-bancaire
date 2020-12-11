package com.banq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banq.entity.Employe;
import com.banq.metier.EmployerMetier;

@RestController
public class EmployeRestService {
	@Autowired
	private EmployerMetier employeMetier;
	
	@RequestMapping(value = "/employes",method = RequestMethod.POST)
	public Employe saveEmploye(@RequestBody Employe employe) {
		return employeMetier.saveEmployer(employe);
	}
	@RequestMapping(value = "/employes",method = RequestMethod.GET)
	public List<Employe> listEmploye(){
		return employeMetier.listEmploye();
	}
  
}
