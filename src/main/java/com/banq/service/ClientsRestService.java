package com.banq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banq.entity.Clients;
import com.banq.metier.ClientsMetier;
@RestController
public class ClientsRestService {
	@Autowired
	private ClientsMetier clientMetier;
	@RequestMapping(value = "/clients",method = RequestMethod.POST)
	 public Clients saveClient(@RequestBody Clients c) {
		 return clientMetier.saveClients(c);
	 }
     
	@RequestMapping(value = "/clients",method = RequestMethod.GET)
	public List<Clients> consulterClient(){
		return clientMetier.consulterClient();
	}
}
