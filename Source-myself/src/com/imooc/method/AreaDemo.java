package com.imooc.method;

public class AreaDemo {
	
	//求圆形面积
	public double area(double r) {
		return r*r*Math.PI;
	}
	//求长方形面积
	public float area(int m,int n) {
		return m*n;
	}
	
	
	public static void main(String[] args) {
		//定义对象
		AreaDemo areademo=new AreaDemo();
		//定义一个double类型的变量存放半径，并初始化
		double r=4.5;
		//定义两个变量存放长和宽，并初始化
		int m=8,n=5;
		//调用方法，求圆的面积并输出
		System.out.println("圆的面积为"+areademo.area(r));
		//调用方法，求长方形的面积并输出
		System.out.println("长方形的面积为"+areademo.area(m, n));

	}

}
