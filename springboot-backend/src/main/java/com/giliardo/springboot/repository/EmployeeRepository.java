package com.giliardo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giliardo.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
