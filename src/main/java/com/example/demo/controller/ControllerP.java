package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Absence;
import com.example.demo.model.Admin;
import com.example.demo.model.Enseignent;
import com.example.demo.model.Etudiant;
import com.example.demo.model.Personne;
import com.example.demo.model.Tache;
import com.example.demo.service.AbscenceService;
import com.example.demo.service.LoginService;

@RestController
public class ControllerP {
	@Autowired
	AbscenceService as;
	@Autowired
	LoginService loginService;
	/*
	@GetMapping(value = "/")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping(value = "/")
	public String authetifierLogin(ModelMap model,@RequestParam String username) {
		Admin a = loginService.authentifier(username);
		
		if(a != null) {
			if(a.getUserName().contains(username)) {
				model.addAttribute("Username", username);
				return "redirect:/welcome";				
			}else {
				//doesn't work !!
				model.put("erreur", "dakchi machi hwa hadak !");
				return "login";	
			}
		}
		else return "login";
	}
	@GetMapping(value = "/welcome")
	public String showWelcomePage() {
		return "welcome";
	}
	
	*/
	
	
	
	
	
	
	// Affichage des absences par tache
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping(value="/list/{mat}/{nom}")
	public Object showList(@PathVariable String mat,@PathVariable String nom){
		return as.showAllAbsence(mat, nom);
		
	}
	
	//Affichage des enseignent
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping(value="enseignent")
	public List<Enseignent> showAllEnseignent(){
		return as.showAllEnseignent();
	}
	//Affichage des etudiant
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping(value="etudiant")
	public List<Etudiant> showAllEtudiant(){
		return as.showAllEtudiant();
	}
	//Affichage des absences
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping(value="/list/{mat}")
	public List<Absence> showAllAbscence(@PathVariable String mat){
		return as.showAllAbscence(mat);
	}
	
	//Insertion
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping(value="/insert")
	public String insert(@RequestBody Absence absence) {
		as.insert(absence);
		return "Done";
	}
}
