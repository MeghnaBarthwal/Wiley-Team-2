package com.beans;

public class Employee {

	int empId;
	String empName;
	public Employee() {
		System.out.println("Employee from constructor called !!");
	}
	public Employee(int empId, String empName, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public void displayEmployee() {
		System.out.println(empId+" "+empName);
	}
	
}
