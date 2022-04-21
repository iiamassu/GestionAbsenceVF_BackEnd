package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Absence;


public interface AbsenceRepository extends JpaRepository<Absence,String> {
	@Query("SELECT a FROM Absence a INNER JOIN a.personne p WHERE p.mat=:matricule")
	List<Absence> getAllAbsenceByPersonne(@Param("matricule") String matricule);
	
	@Query("SELECT a FROM Absence a INNER JOIN a.tache t WHERE t.nom_tache=:nomTache")
	List<Absence> getAllAbsenceByTache(@Param("nomTache") String nomTache);
	
	@Query("SELECT a.date,a.heure_debut,a.heure_fin,a.motif FROM Absence a INNER JOIN a.personne p INNER JOIN a.tache t WHERE t.nom_tache=:nomTache AND p.mat=:matricule")
	Object getAllAbsenceByPersonneByTache(@Param("matricule") String matricule,@Param("nomTache") String nomTache);
	
}