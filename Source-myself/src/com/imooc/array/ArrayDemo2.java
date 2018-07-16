package com.imooc.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义一个整型数组，并初始化
		int[] a = { 1, 3, 6, 12, 15 };
		System.out.println("能被3整除的数组元素有");
		// 循环遍历数组，找出能被3整除的元素并打印输出
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				System.out.println(a[i]);
			} else {
				continue;
			}
		}

	}

}
