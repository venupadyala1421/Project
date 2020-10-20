package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Interface for employee resource operations.
 */
public interface EmployeeResource {

	/**
	 * Implementation get employee details Api call.
	 */
    @RequestMapping("/v1/bfs/employees/{id}")
    ResponseEntity<Employee> employeeGetById(@PathVariable("id") String id);
    
    /**
	 * Implementation save  employee details Api call.
	 */
   
    @PostMapping("/v1/bfs/employee/save")
    ResponseEntity<Employee> employeeSaveId(@RequestBody Employee employee);
}
