package com.imooc.test;

public class Code {

	{
		System.out.println("Code的构造快");
	}
	static{
			System.out.println("Code的静态");
	}
	
	public Code() {
		System.out.println("Code的构造方法");
	}
}
