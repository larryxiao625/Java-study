package com.imooc.operator;

import java.util.Scanner;

public class LogicDemo4 {
	
	public static void main(String[] args) {
		//输入一个整数
		System.out.print("输入一个整数");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(!(n%3!=0))
		{
			System.out.println("能被3整除");
		}else {
			System.out.println("不能被3整除");
		}
	}

}
