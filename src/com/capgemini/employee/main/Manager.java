package com.capgemini.employee.main;

public class Manager extends Employee {
	 private double petrolAllowance;
	 private double foodAllowance;
	 private double otherAllowance;
	 private double totalManagerGross;
	 
	 public Manager() {
		super();
		
	}
	public Manager(int employeeID, String employeeName, double basicSalary, double medical) {
		super(employeeID, employeeName, basicSalary, medical);
		this.petrolAllowance = 0.08 *getBasicSalary();
		this.foodAllowance = 0.13 *getBasicSalary();
		this.otherAllowance = 0.03 *getBasicSalary();
		
	}
	
	
	public double grossSalaryOfManagerCheck() {
		
		
		totalManagerGross= super.grossNetCheck() + petrolAllowance + foodAllowance + otherAllowance ;
		return totalManagerGross;
	}
	
	

}

