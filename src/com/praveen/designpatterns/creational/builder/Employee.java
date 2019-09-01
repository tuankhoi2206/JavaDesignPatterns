package com.praveen.designpatterns.creational.builder;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empAddress;

	public Employee(int empId, String empName, double empSalary, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}

	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}

	public static class EmployeeBuilder {
		private int empId;
		private String empName;
		private double empSalary;
		private String empAddress;

		EmployeeBuilder() {

		}
		public EmployeeBuilder empId(int empId) {
			this.empId = empId;
			return this;
		}

		public EmployeeBuilder empName(String empName) {
			this.empName = empName;
			return this;
		}

		public EmployeeBuilder empSalary(double empSalary) {
			this.empSalary = empSalary;
			return this;
		}

		public EmployeeBuilder empAddress(String empAddress) {
			this.empAddress = empAddress;
			return this;
		}
		
		public Employee build() {
			return new Employee(empId, empName, empSalary, empAddress);
		}
	}	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}

	public static void main(String args[]) {
		Employee emp= new Employee.EmployeeBuilder().empId(149903).empName("Praveen").empSalary(1000000d).empAddress("Hyderabad").build();
		System.out.println(emp);
	}

}