package com.devsuperior.bds01.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query("SELECT obj FROM Employee obj ORDER BY obj.name ASC")
	List<Employee> findAllByName();
	
	Employee save(Employee entity);	
	
	@Query("SELECT DISTINCT obj FROM Employee obj ORDER BY obj.name ASC")
	Page<Employee> find(String name, Pageable pageable);
	
	Page<Employee> findAll(Pageable pageable);
	

}
