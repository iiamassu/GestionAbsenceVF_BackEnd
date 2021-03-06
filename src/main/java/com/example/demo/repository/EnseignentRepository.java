package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Enseignent;


public interface EnseignentRepository  extends JpaRepository<Enseignent,String> {
	@Query("SELECT e FROM Enseignent e")
	List<Enseignent> getAllEnseignent();
}
