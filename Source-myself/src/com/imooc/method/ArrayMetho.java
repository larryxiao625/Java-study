package com.imooc.method;

import java.util.Scanner;

public class ArrayMetho {
	
	
	//打印输出数组元素的值
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"     ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayMetho arraymethod=new ArrayMetho();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组长度");
		int n=sc.nextInt();
		int[] arr=new int[n];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素");
			arr[i]=input.nextInt();
		}
		arraymethod.printArray(arr);
		
	}

}
