package com.imooc.flow;

import java.util.Scanner;

public class IntCompare {

	public static void main(String[] args) {
		int a,b;
		//从键盘输入两个整型变量并初始化
		System.out.print("输入a");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("输入b");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		//判断x和y是否相等
		if(a!=b) {
			if(a>b) {
				System.out.println(a+"大于"+b);
			}else {
				System.out.println(a+"小于"+b);
			}
		}else {
			System.out.println(a+"和"+b+"相等");
		}

	}

}
