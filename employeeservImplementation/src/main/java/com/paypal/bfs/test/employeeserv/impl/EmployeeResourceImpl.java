package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.dao.EmployeeDao;
import com.paypal.bfs.test.employeeserv.model.Employees;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	EmployeeDao empDao;
	/**
	 * Implementation  for  get employee Details.
	 */
	@Override
	public ResponseEntity<Employee> employeeGetById(String id) {

		Employee employee = new Employee();

		Optional<Employees> optemployees = empDao.findById(Integer.valueOf(id));
		if (optemployees.isPresent()) {
			Employees employees = optemployees.get();
			employee.setId(employees.getId());
			employee.setFirstName(employees.getFirstName());
			employee.setLastName(employees.getLastName());
			employee.setDateOfBirth(employees.getDate_Of_Birth());
			Address address = new Address();
			address.setLane1(employees.getLane1());
			address.setLane2(employees.getLane2());
			address.setCity(employees.getCity());
			address.setState(employees.getState());
			address.setCountry(employees.getCountry());
			address.setZipCode(employees.getZip_code());
			employee.setAddress(address);
		}

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	/**
	 * Implementation  for  save  employee Details.
	 */
	@Override
	public ResponseEntity<Employee> employeeSaveId(Employee employee) {

		Employees employees = new Employees();

		employees.setId(employee.getId());
		employees.setFirstName(employee.getFirstName());
		employees.setLastName(employee.getLastName());
		employees.setDate_Of_Birth(employee.getDateOfBirth());
		employees.setLane1(employee.getAddress().getLane1());
		employees.setLane2(employee.getAddress().getLane2());
		employees.setCity(employee.getAddress().getCity());
		employees.setState(employee.getAddress().getState());
		employees.setCountry(employee.getAddress().getCountry());
		employees.setZip_code(employee.getAddress().getZipCode());
		empDao.save(employees);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

}
