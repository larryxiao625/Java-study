package com.imooc.method;

import java.util.Scanner;

public class FacDemo {

	// 求阶乘的方法
	// 方法不能嵌套定义
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;// s=s*i
		}
		return s;
	}

	public static void main(String[] args) {
		FacDemo facdemo = new FacDemo();
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fac = facdemo.fac(n);
		System.out.println(n + "的阶乘为" + fac);
		int sum = 0;
		// 求1！+2！+3！+4！+5！
		for (int i = 1; i <= 5; i++) {
			fac = facdemo.fac(i);
			sum = sum + fac;
		}
		System.out.println(sum);

	}

}
