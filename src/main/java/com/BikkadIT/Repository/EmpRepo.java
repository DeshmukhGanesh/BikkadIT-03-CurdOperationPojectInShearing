package com.BikkadIT.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

	
	public List<Employee> findByEmpAgeLessThanEqual(List<Employee> employees);
	
	public Employee findByEmpNameAndPassword(String empName,String empPassword);
	
}
