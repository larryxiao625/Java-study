package com.imooc.animal;

public class Animal {
	private String name;//昵称
	private int month;//月份
	private String speices;//品种
	
	public Animal() {
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpeices() {
		return speices;
	}

	public void setSpeices(String speices) {
		this.speices = speices;
	}
	//吃东西
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
}
