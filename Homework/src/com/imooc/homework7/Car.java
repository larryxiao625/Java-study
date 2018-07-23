package com.imooc.homework7;

public class Car {
	private String color;
	private String userName;
	public Car() {
		
	}
	
	public Car(String color,String userName) {
		this.color=color;
		this.userName=userName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void use() {
		System.out.println("我是机动车!");
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		Car temp=(Car)obj;
		if(temp.getColor().equals(this.getColor())&&temp.getUserName().equals(this.getUserName()))
			return true;
		else
			return false;
	}
}
