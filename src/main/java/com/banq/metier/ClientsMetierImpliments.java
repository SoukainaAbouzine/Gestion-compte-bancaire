package com.banq.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banq.dao.ClientsRepository;
import com.banq.entity.Clients;
@Service
public class ClientsMetierImpliments implements ClientsMetier {
     @Autowired
	private ClientsRepository clientsRepository;
	@Override
	public Clients saveClients(Clients c) {
		// TODO Auto-generated method stub
		return clientsRepository.save(c);
	}

	@Override
	public List<Clients> consulterClient() {
		// TODO Auto-generated method stub
		return clientsRepository.findAll() ;
	}

	@Override
	public void deleteClient(String codeClient) {
		// TODO Auto-generated method stub
		
	}

}
