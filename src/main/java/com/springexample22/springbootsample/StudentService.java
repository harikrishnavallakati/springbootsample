package com.springexample22.springbootsample;

import java.util.List;
import java.util.Optional;

public interface StudentService {
	public Optional<Student> getStudentById(long id);
	public boolean insertStudent(Student s);
	public List<Student> getAllStudents();
	public List<Student> getDate();
}
