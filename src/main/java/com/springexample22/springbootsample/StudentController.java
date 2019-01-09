package com.springexample22.springbootsample;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/{id}")
	public Optional<Student> getStudent(@PathVariable(value="id") long id) {
		return studentService.getStudentById(id);
		
	}
	
	@RequestMapping(value="/students")
	public ResponseEntity<List<Student>> getAllArticles() {
		List<Student> list = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/studentDate")
	public ResponseEntity<List<Student>> getAllArticless(@RequestParam("date") 
    @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate date) {
		List<Student> list = studentService.getDate();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Student student, UriComponentsBuilder builder) {
		boolean flag = studentService.insertStudent(student);
	if (flag == false) {
	   return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
	else
        return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	/*@RequestMapping(value="/save", method=RequestMethod.POST)
	public void saveStudent(@RequestBody Student s) {
		studentService.insertStudent(s);;
		
	}*/
	
	@RequestMapping(value="/datediff")
	public long getDateDiff() {
		long days = studentService.getDateDiff();
		return days;
	}
	
}
