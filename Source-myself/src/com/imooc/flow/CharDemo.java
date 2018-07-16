package com.imooc.flow;

import java.util.Scanner;

public class CharDemo {
    public static void main(String[] args) {
		//定义一个字符变量并初始化
		System.out.println("输入一个字母");
		Scanner s=new Scanner(System.in);
		String ch=s.next();
		ch=ch.toLowerCase();//将所有值转换为小写
		//使用switch结构判断是否为元音字母，并输出对应的信息
		switch(ch){
		    case "a":
		        System.out.println("元音字母"+ch);break;
		    case "e":
		        System.out.println("元音字母"+ch);break;
		    case "i":
		        System.out.println("元音字母"+ch);break;
		    case "o":
		        System.out.println("元音字母"+ch);break;
		    case "u":
		        System.out.println("元音字母"+ch);break;
		    default:System.out.println("输入不是元音字母");
		}
	}
}