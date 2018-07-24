package com.imooc.homework11;

public class Circle extends Shape{
	private float r;
	public Circle() {
		
	}
	public Circle(float r) {
		this.r=r;
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public double area() {
		double s=Math.PI*r*r;
		return s;
	}
}
