package com.imooc.flow1;

public class NineNineDemo {

	public static void main(String[] args) {
		int m, n, sum;
		for (m = 1; m <= 9; m++) {
			for (n = 1; n <= 9; n++) {
				sum = m * n;
				System.out.print(m + "*" + n + "=" + sum + " ");
			}
			System.out.println();
		}

	}

}
