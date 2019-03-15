package com.capgemini.employee.main;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double hra;
	private double basicSalary;
	private double medical;
	private double providentFund;
	public static final double pt=200;
	private double netSalary;
	private double grossSalary;

	public Employee() {
		super();
		
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployee_id(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(double providentFund) {
		this.providentFund = providentFund;
	}



	/*public double hraCheck(double basicSalary)
	{
		hra = 0.5 * basicSalary;
		return basicSalary;
	}

	public double providentFundCheck(double basicSalary) {
		providentFund = 0.12 * basicSalary;
		return basicSalary;
		
	}

	public double grossSalaryCheck(double basicSalary,double medical) {
		
		hra = 0.5 * basicSalary;
		providentFund = 0.12 * basicSalary;
		grossSalary= basicSalary + hra + medical;
		return grossSalary;
	}*/

	public double grossNetCheck() {
		
		hra = 0.5 * this.basicSalary;
		providentFund = 0.12 * this.basicSalary;
		grossSalary= this.basicSalary + hra + this.medical;
		netSalary = this.grossSalary - (this.providentFund+pt) ;
		return netSalary;
		
	}
	
}
