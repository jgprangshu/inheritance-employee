package com.capgemini.employee.main;

public class Marketing extends Employee{
	
	private double kilometers;
	private double tourAllowance;
	private double totalMarketingGrossSalary;
	public static final double telephoneAllowance=1500;

	public Marketing() {
		super();
		
	}
	
	public Marketing(int employeeID, String employeeName, double basicSalary, double medical,double kilometers) {
		super(employeeID, employeeName, basicSalary, medical);
		this.kilometers = kilometers;
		
	}

	public double grossSalaryOfMarketingCheck() {
		tourAllowance = this.kilometers *5 ;
		totalMarketingGrossSalary = super.grossNetCheck() + tourAllowance + telephoneAllowance ;
		 
		return totalMarketingGrossSalary;
	}


}
