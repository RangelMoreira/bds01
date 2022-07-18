package com.devsuperior.bds01.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.bds01.entities.Department;

public interface  DepartmentRepository extends JpaRepository<Department, Long>{
	
	@Query("SELECT obj FROM Department obj ORDER BY obj.name ASC")
	List<Department> findAllByName();

}