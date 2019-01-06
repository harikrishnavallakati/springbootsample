package com.springexample22.springbootsample;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
	public Optional<Employee> getEmployeeById(long id);
	public boolean insertEmployee(Employee s);
	public List<Employee> getAllEmployees();
}
