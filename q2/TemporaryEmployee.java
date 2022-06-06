package com.q2;

public abstract class TemporaryEmployee extends Employee {
	
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	
	@Override
	public double calculateSalary(){
		salary = hoursWorked * hourlyWages;
		return salary;
		
	}
	

	

	

}
