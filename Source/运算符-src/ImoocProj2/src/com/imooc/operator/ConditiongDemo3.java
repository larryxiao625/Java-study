package com.imooc.operator;

import java.util.Scanner;

public class ConditiongDemo3 {

	public static void main(String[] args) {
		System.out.println("输入数a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("输入数b");
		Scanner t=new Scanner(System.in);
		int b=t.nextInt();
		int max;
		max=a>b?a:b;
		System.out.println("max="+max);
		boolean c=a>b?(3<6):(3>6);
		System.out.println("c="+c);
		
		
		
		
		

	}

}
