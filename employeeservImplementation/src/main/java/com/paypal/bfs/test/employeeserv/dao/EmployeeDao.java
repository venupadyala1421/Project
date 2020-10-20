package com.paypal.bfs.test.employeeserv.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paypal.bfs.test.employeeserv.model.Employees;
@Repository
public interface EmployeeDao extends CrudRepository<Employees, Integer> {
   
} 


