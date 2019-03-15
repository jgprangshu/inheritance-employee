package com.capgemini.employee.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.main.Manager;

public class TestManager {
		
		Manager manager;
			
		@Before
		public void setUp(){
			manager = new Manager(101,"Ram",2000,500);
		}

		@Test
		public void testObjectIsCreatedWithDefaultConstructor(){
			Manager manager =new Manager();
			assertNotNull(manager);
		}

		@Test
		public void testCheckGrossSalary() {
			
			assertEquals(3540,manager.grossSalaryOfManagerCheck(),0.05);
		}

}
