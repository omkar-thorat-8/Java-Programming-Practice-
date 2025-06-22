package com.obito;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="EmpId")
	int EmpId;
	String Name;
	double Salary;
	
	
	public Employee() {
		
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employee(int empId, String name, double salary) {
		super();
		EmpId = empId;
		Name = name;
		Salary = salary;
	}
	
	

}