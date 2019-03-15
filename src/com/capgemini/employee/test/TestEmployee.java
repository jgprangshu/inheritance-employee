package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.main.Employee;

public class TestEmployee {
	
	Employee employee;
		
	@Before
	public void setUp(){
		employee = new Employee(101,"Ram",2000,500);
	}

	@Test
	public void testObjectIsCreatedWithDefaultConstructor(){
		Employee employee =new Employee();
		assertNotNull(employee);
	}
	
	@Test
	public void testObjectIsCreatedWithParameterizedConstructor() {
		Employee employee =new Employee(101,"Ram",20000,500);
		assertEquals(101,employee.getEmployeeId());
		assertEquals("Ram",employee.getEmployeeName());
		assertEquals(20000,employee.getBasicSalary(),0.01);
		assertEquals(500, employee.getMedical(),0.01);
		
	}
	
	/*@Test
	public void testHraCheck() {
		employee.hraCheck(20000);
		assertEquals(10000.0,employee.getHra(),0.01);
	}
	

	@Test
	public void testProvidentFund() {
		employee.providentFundCheck(20000);
		assertEquals(2400,employee.getProvidentFund(),0.01);
	}
	
	@Test
	public void testGrossSalary() {
		employee.grossSalaryCheck(20000,500);
		assertEquals(455555,employee.getGrossSalary(),0.05);
	}*/
	
	@Test
	public void testNetSalary() {
		
		assertEquals(3060,employee.grossNetCheck(),0.05);
	}
	

}
