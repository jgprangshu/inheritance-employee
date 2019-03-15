package com.capgemini.employee.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.main.Marketing;

public class TestMarketing {
	
	Marketing marketing;
		
	@Before
	public void setUp(){
		marketing = new Marketing (101,"Ram",2000,500,5);
	}

	@Test
	public void testMarketingSalary() {
		assertEquals(4585, marketing.grossSalaryOfMarketingCheck(),0.05);
		
	}

}
