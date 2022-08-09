package com.BikkadIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Model.Employee;
import com.BikkadIT.Repository.EmpRepo;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	public EmpRepo empRepo;

	@Override
	public Employee addEmp(Employee employee) {
		Employee save = empRepo.save(employee);
		if (save != null) {
			return save;
		}
		return null;
	}

	@Override
	public List<Employee> addMultipleEmp(List<Employee> employee) {
		List<Employee> saveAll = empRepo.saveAll(employee);
		if (saveAll != null) {
			return saveAll;
		}
		return null;
	}

	@Override
	public Employee getEmpById(Integer id) {
		Employee byId = empRepo.findById(id).get();
		if (byId != null) {
			return byId;
		}
		return null;
	}

	@Override
	public List<Employee> getMultipleEmpById() {
		List<Employee> findAll = empRepo.findAll();
		return findAll;
	}

	@Override
	public List<Employee> getEmpByAgeLessThanOrEqual(List<Employee> employees) {
		List<Employee> ageLessThanEqual = empRepo.findByEmpAgeLessThanEqual(employees);
		return ageLessThanEqual;
	}

	@Override
	public Employee loginCheck(Employee employee) {
		Employee empNameAndPassword = empRepo.findByEmpNameAndPassword(employee.getEmpName(),
				employee.getEmpPassword());
		return empNameAndPassword;
	}

	@Override
	public boolean updateEmp(Employee employee) {
		boolean existsById = empRepo.existsById(employee.getEmpId());
		if (existsById) {
			Employee update = empRepo.save(employee);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> updateMultipleEmp(List<Employee> employees) {
		List<Employee> updateMultiple = empRepo.saveAll(employees);
		return updateMultiple;
	}

	@Override
	public boolean deleteEmpById(int  id ) {
		boolean existsById = empRepo.existsById(id);
		if(existsById) {
			empRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public void deleteMultipleEmp() {
		
		empRepo.deleteAll();
	}

}
