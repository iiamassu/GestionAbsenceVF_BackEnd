package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Service {
	@Id
	@GeneratedValue
	private int id;
	@Column(length=255)
	private String nom_service;
	@OneToMany(mappedBy="service")
	List<Tache> tache;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_service() {
		return nom_service;
	}
	public void setNom_service(String nom_service) {
		this.nom_service = nom_service;
	}
	public Service() {
		super();
	}
	
	
}
