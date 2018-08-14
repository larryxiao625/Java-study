package com.imooc.employee;

public class Employee {
	String name;
	double salary;
	int id;
	public  Employee(String name,double salary,int id) {
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
