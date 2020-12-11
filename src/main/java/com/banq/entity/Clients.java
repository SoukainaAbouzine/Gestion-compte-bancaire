package com.banq.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Table(name = "CLIENT")
public class Clients implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeClients;
	private String nomClients;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	
	private Collection<Compte> comptes;

	public Clients(String nomClients) {
		super();
		this.nomClients = nomClients;
	}

	public Long getCodeClients() {
		return codeClients;
	}
	
	public void setCodeClients(Long codeClients) {
		this.codeClients = codeClients;
	}

	public String getNomClients() {
		return nomClients;
	}

	public void setNomClients(String nomClients) {
		this.nomClients = nomClients;
	}

	

	
    @JsonIgnore
    
	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	public Clients() {
		super();
	}

}
