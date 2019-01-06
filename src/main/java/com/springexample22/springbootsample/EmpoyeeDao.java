package com.springexample22.springbootsample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpoyeeDao extends CrudRepository<Employee, Long>{

}
