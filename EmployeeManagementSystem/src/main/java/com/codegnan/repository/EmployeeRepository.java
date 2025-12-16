package com.codegnan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegnan.Model.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{
	
	public boolean existsByEmailAndPassword(String email,String Password);

	

	public Optional<Employee> findByEmailAndPassword(String email, String password);
}
