package com.banq.metier;

import java.util.List;

import com.banq.entity.Clients;

public interface ClientsMetier {
	public Clients saveClients(Clients c);
	public List<Clients> consulterClient();
	public void deleteClient(String codeClient);

}
