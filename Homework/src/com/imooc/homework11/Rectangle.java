package com.imooc.homework11;

public class Rectangle extends Shape{
	private float length;
	private float wide;
	public Rectangle() {
		
	}
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWide() {
		return wide;
	}

	public void setWide(float wide) {
		this.wide = wide;
	}

	public Rectangle(float length,float wide) {
		this.length=length;
		this.wide=wide;
	}
	public double area() {
		double s=this.length*this.wide;
		return s;
	}
}
