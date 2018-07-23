package com.imooc.homework7;

public class Taxi extends Car{
	private String company;
	public Taxi() {
		
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Taxi(String color,String userName,String company) {
		super(color,userName);
		this.company=company;
	}
	
	final public String ride() {
		String str=this.getUserName()+"出租车是属于"+this.company+"公司的";
		return str;
	}
	public void use() {
		System.out.println("出租车是提高生活质量的重要条件之一");
	}
	
	public String toString() {
		String str="taxi的信息是："+this.getUserName()+"拥有一辆"+this.getColor()+"的出租车";
		return str;
	}
}
