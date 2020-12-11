package com.banq.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banq.dao.EmployeRepository;
import com.banq.entity.Employe;
@Service
public class EmployerMetierImpliments implements EmployerMetier{
	 @Autowired
	private EmployeRepository employeRepository;

	@Override
	public Employe saveEmployer(Employe employe) {
		// TODO Auto-generated method stub
		return employeRepository.save(employe);
	}

	@Override
	public List<Employe> listEmploye() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

}
