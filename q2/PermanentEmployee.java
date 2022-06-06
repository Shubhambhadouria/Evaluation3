package com.q2;

public abstract class PermanentEmployee extends Employee {
	
	private double basicPay;

	@Override
	public double calculateSalary(){
		double pfamount = basicPay*0.12;
		double salary = basicPay-pfamount;
		Employee e1 = new Employee();
		e1.setSalary(salary);
		return salary;
		
	}

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	
	
 
//	salary = basicPay – PF amount;
//	Set this value to the salary attribute.
//	Here PF Amount = basicPay * 0.12
	
}
