package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		System.out.println("请输入表示星期的英文单词");
		Scanner s = new Scanner(System.in);
		String week = s.next();
		week = week.toUpperCase();// 把字符串中的字符全部改为大写
		switch (week) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入值错误");
		}
	}
}
