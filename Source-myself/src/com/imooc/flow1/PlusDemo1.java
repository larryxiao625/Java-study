package com.imooc.flow1;

public class PlusDemo1 {

	public static void main(String[] args) {
		// 求1+3+5+。。。。+15
		int n = 1;
		int sum = 0;
		while (n <= 15) {
			sum = sum + n;
			n = n + 2;
		}
		System.out.println(sum);
	}

}
