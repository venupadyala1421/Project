package employeeservFunctionalTests;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.impl.EmployeeResourceImpl;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
@ComponentScan("com.paypal")
public class employeeservFunctionalTests {

	@Autowired
	EmployeeResourceImpl employeeResource;
	/**
	 * Implementation for  employee FunctionalTests.
	 */
	@Test
	public void testSave() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("abc");
		employee.setLastName("abc");
		employee.setDateOfBirth("abc");

		Address address = new Address();
		address.setLane1("lane");
		address.setLane2("lane2");

		address.setCity("city");
		address.setState("state");
		address.setCountry("country");
		address.setZipCode(12345);

		employee.setAddress(address);

		employeeResource.employeeSaveId(employee);
		System.out.println("(employee.getId() " + employee.getId());
		ResponseEntity<Employee> empl = employeeResource.employeeGetById(employee.getId().toString());
		Employee em = empl.getBody();

		Assert.assertEquals(em.getFirstName(), employee.getFirstName());
		Assert.assertEquals(em.getLastName(), employee.getLastName());
		Assert.assertEquals(em.getDateOfBirth(), employee.getDateOfBirth());
		Assert.assertEquals(em.getAddress(), employee.getAddress());
	}

}
