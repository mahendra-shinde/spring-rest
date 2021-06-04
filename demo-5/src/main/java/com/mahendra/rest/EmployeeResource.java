package com.mahendra.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mahendra.models.Employee;

@RepositoryRestResource(path="employees")
public interface EmployeeResource extends CrudRepository<Employee, Integer>{
	
}
