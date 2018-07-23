package com.imooc.homework4;

public class NonMotor {
	private String brand;
	private String color;
	private int wheel = 2;
	private int seat = 1;

	public NonMotor() {

	}

	public NonMotor(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public NonMotor(String brand, String color, int wheel, int seat) {
		this.brand = brand;
		this.color = color;
		this.wheel = wheel;
		this.seat = seat;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String work() {
		String str="这是一辆" + this.getColor() + "颜色的，" + this.getBrand() + "牌的非机动车,有" + this.getWheel()
				+ "个轮子，有" + this.getSeat() + "个座椅的非机动车";
		return str;
	}
}
