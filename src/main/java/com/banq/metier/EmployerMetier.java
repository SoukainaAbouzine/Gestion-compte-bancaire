package com.banq.metier;

import java.util.List;

import com.banq.entity.Employe;

public interface EmployerMetier {
	 public Employe  saveEmployer(Employe employe);
	 public List<Employe> listEmploye();

}
