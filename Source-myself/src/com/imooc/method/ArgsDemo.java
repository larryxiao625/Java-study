package com.imooc.method;

public class ArgsDemo {
	
	//求和
	public void sum(int... n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		ArgsDemo ar=new ArgsDemo();
		ar.sum(1);
		ar.sum(1,2);
		ar.sum(1,2,3);
	}

}
