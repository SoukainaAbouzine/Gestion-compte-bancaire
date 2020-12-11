package com.banq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banq.entity.Clients;

public interface ClientsRepository extends JpaRepository<Clients,Long>{

}
