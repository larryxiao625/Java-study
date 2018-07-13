package com.imooc.method;

import java.util.Scanner;

public class ArrayDemo {
	
	public boolean search(int n,int[] arr) {
		boolean flag=false;//默认为没找到
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查找的数");
		int n=sc.nextInt();
		ArrayDemo arrayDemo=new ArrayDemo();
		if(arrayDemo.search(n, arr)) {
			System.out.println("YES");
		}else {
			System.out.println("no");
		}

	}

}
