package com.imooc.operator;

public class TEST22 {

	public static void main(String[] args) {
		char c='c';
		int i=10;
		double d=10;
		long l=10;
		String s="Hello";
		int a=2;
		//c+=i;	//自动进行了类型转换
		//c=(char) (c+i);	//不会自动进行类型转换，需要强制类型转换
		System.out.println("c="+c);
	    s+=i;
	    System.out.println("s="+s);
		

	}

}
