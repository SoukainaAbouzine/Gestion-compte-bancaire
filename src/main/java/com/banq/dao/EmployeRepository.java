package com.banq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banq.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {

}
