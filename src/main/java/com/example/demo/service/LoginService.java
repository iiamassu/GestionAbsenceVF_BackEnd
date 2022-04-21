package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class LoginService {
	@Autowired 	
	AdminRepository adminRepo;

	public void addLogin(Admin a) {
		adminRepo.save(a);
	}
	
	public Admin authentifier(String username) {
		Admin a = adminRepo.findLoginByUserName(username);
		return a;
	}
	
	public Admin findLoginByUsernameAndPassword(String username,String motdepass) {
		Admin a = adminRepo.findLoginByUsernameAndPassword(username, motdepass);
		return a;
	}
	
	public List<Admin> getLogins(){
		return adminRepo.findAll();
	}

}