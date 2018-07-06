package com.imooc.flow1;

public class ForDemo {

	public static void main(String[] args) {
		int sum=0;
		for(int n=1;n<=5;n++) {	//n=1在循环中只执行一次
			sum=sum+n;
		}
		System.out.println("sum="+sum);

	}

}
