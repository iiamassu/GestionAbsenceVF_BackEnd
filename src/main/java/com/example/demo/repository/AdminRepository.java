package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Admin;


public interface AdminRepository  extends JpaRepository<Admin,String> {
	@Query("SELECT a FROM Admin a WHERE a.userName=:username AND a.password=:motdepass")
	public Admin findLoginByUsernameAndPassword(@Param(value = "username") String username,@Param(value = "motdepass") String motdepass);
	
	public Admin findLoginByUserName(String username);
}
