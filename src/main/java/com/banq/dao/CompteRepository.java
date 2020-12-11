package com.banq.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.banq.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{
	

}
