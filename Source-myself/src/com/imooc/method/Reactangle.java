package com.imooc.method;

public class Reactangle {
	
	//求长方形面积的方法
	public int area() {
		int length=10;
		int width=5;
		int getarea=length*width;
		return getarea;//返回语句
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reactangle rc=new Reactangle();
		int area=rc.area();
		System.out.println("长方形的面积为"+rc.area());
		

	}

}
