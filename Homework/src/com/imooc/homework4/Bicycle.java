package com.imooc.homework4;

public class Bicycle extends NonMotor{
	public Bicycle() {
		
	}
	
	public Bicycle(String color,String brand) {
		super(color,brand);
		
	}
	
	public String work() {
		String str="这是一辆"+this.getColor()+"颜色的,"+this.getBrand()+"牌的自行车";
		return str;
	}
	
}
