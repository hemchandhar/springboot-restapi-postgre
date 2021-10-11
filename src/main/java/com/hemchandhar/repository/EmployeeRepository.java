package com.hemchandhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemchandhar.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
