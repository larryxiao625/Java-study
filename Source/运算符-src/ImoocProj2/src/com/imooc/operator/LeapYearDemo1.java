package com.imooc.operator;

import java.util.Scanner;

public class LeapYearDemo1 {

	public static void main(String[] args) {
		System.out.println("请输入年份：");
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if((year%4==0)&(year%100!=0)|(year%4==100)) {
			System.out.println("年份是闰年");
		}else {
			System.out.println("年份不是闰年");
		}

	}

}
