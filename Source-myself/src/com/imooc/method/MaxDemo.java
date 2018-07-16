package com.imooc.method;

public class MaxDemo {
	
	//求最大值的方法
	public void max(float a,float b) {
		float max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println("两个数"+a+"和"+b+"的最大值为"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDemo maxdemo=new MaxDemo();
		float a=5,b=3;
		maxdemo.max(a, b);
		float m=5.6f,n=8.9f;
		maxdemo.max(m, n);
		maxdemo.max(9.8f, 12.8f);
	}

}
