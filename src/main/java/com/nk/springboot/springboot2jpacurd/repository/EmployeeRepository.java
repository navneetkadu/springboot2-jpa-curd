package com.nk.springboot.springboot2jpacurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nk.springboot.springboot2jpacurd.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
