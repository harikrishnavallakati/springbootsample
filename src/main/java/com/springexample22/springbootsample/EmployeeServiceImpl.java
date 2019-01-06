package com.springexample22.springbootsample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmpoyeeDao employeeDao;

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	@Override
	public boolean insertEmployee(Employee s) {
		employeeDao.save(s);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		employeeDao.findAll().forEach(e -> list.add(e));
		// TODO Auto-generated method stub
		return list;												
	}

}
