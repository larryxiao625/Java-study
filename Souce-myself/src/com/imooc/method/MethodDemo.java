package com.imooc.method;

import java.util.Scanner;

public class MethodDemo {
	//打印输出星号的办法
	public void printStar() {
		System.out.println("*************");

	}

	public static void main(String[] args) {
		MethodDemo myMethodDemo=new MethodDemo();
		myMethodDemo.printStar();
		System.out.println("*************");
		System.out.println("欢迎来到java的世界！");
		System.out.println("*************");
		myMethodDemo.printStar();
	}


}
