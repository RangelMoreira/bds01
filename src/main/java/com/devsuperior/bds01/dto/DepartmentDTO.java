package com.devsuperior.bds01.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.entities.Employee;

public class DepartmentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String name;
	

	public List<EmployeeDTO> employeesDTO = new ArrayList<>();
	
	
	public DepartmentDTO() {
		
	}

	public DepartmentDTO(Long id, String name, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		employees.forEach(emp -> this.employeesDTO.add(new EmployeeDTO(emp)));
	}
	
	public DepartmentDTO(Department department) {
		this.id = department.getId();
		this.name = department.getName();
		department.getEmployees().forEach(emp -> this.employeesDTO.add(new EmployeeDTO(emp)));
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<EmployeeDTO> getEmployeesDTO() {
		return employeesDTO;
	}


	public void setEmployeesDTO(List<EmployeeDTO> employeesDTO) {
		this.employeesDTO = employeesDTO;
	}
	
	
}
