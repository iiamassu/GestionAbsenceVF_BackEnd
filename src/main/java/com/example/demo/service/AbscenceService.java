package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Absence;
import com.example.demo.model.Enseignent;
import com.example.demo.model.Etudiant;
import com.example.demo.model.Personne;
import com.example.demo.model.Tache;
import com.example.demo.repository.AbsenceRepository;
import com.example.demo.repository.EnseignentRepository;
import com.example.demo.repository.EtudiantRepository;

@Service
public class AbscenceService {
	@Autowired
	AbsenceRepository ar;
	@Autowired
	EnseignentRepository er;
	@Autowired
	EtudiantRepository etr;
	
	public List<Enseignent> showAllEnseignent() {
		return er.findAll();
	}
	
	public List<Etudiant> showAllEtudiant() {
		return etr.findAll();
	}
	
	
	public Object showAllAbsence(String mat,String nomTache){
		return ar.getAllAbsenceByPersonneByTache(mat, nomTache);
	}
	
	public void insert(Absence absence) {
		if(absence.getMotif().equals("")) {
			absence.setMotif("Pas de justification");
		}

		/*
		t.setId(id_tache);
		p.setMat(mat);
		a.setHeure_debut(hd);
		a.setHeure_fin(hf);
		a.setMotif(motif);
		a.setPersonne(p);
		a.setTache(t);
		a.setDate(date);*/
		ar.save(absence);
		
	}
	
	
	public List<Absence> showAllAbscence(String mat){
		return ar.getAllAbsenceByPersonne(mat);
	}
	
}
