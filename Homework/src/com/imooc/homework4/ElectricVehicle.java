package com.imooc.homework4;

public class ElectricVehicle extends NonMotor{
	private String battery;
	public ElectricVehicle() {
		
	}
	public ElectricVehicle(String battery) {
		this.battery=battery;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String work() {
		String str="这是一辆使用"+this.getBattery()+"牌电池的电动车";
		return str;
	}
	
}
