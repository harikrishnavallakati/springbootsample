package com.springexample22.springbootsample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	@Override
	public Optional<Student> getStudentById(long id) {
		return studentDao.findById(id);
	}

	@Override
	public boolean insertStudent(Student s) {
		studentDao.save(s);
		return true;

	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList<>();
		studentDao.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	@Override
	public List<Student> getDate() {
		List<Student> list = new ArrayList<>();
		studentDao.findAll().forEach(e -> list.add(e));
		return list;
	}


}
