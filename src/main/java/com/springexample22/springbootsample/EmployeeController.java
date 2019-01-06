package com.springexample22.springbootsample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/id")
	public Optional<Employee> geEmployee(@PathVariable(value="id") long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:9090")
	@RequestMapping(value="/employees")
	public ResponseEntity<List<Employee>> getAllArticles() {
		List<Employee> list = employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Employee employee) {
		boolean flag = employeeService.insertEmployee(employee);
	if (flag == false) {
	   return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
	else
        return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
