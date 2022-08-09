package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.Model.Employee;

public interface ServiceI {

	public Employee addEmp(Employee employee);
	
	public List<Employee> addMultipleEmp(List<Employee> employee);
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getMultipleEmpById();
	
	public List<Employee> getEmpByAgeLessThanOrEqual(List<Employee> employees);
	
	public Employee loginCheck(Employee employee);
	
	public boolean updateEmp(Employee employee);
	
	public List<Employee> updateMultipleEmp(List<Employee> employee);
	
	public boolean deleteEmpById(int id);
	
	public void deleteMultipleEmp();

	
	
	
	
	
}
