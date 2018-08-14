package com.imooc.employee;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee one=new Employee("张三",5000.0,1);
		Employee two=new Employee("李四",5500.0,2);
		Employee three=new Employee("赵六",4000.0,3);
		ArrayList<Employee> EmployeeList=new ArrayList<Employee>();
		EmployeeList.add(one);
		EmployeeList.add(two);
		EmployeeList.add(three);
		System.out.println("员工姓名   "+"员工薪资");
		for(int i=0;i<EmployeeList.size();i++) {
			System.out.println(((EmployeeList.get(i))).getName()+"       "+((EmployeeList.get(i))).getSalary());
			
		}
		
	}
}
