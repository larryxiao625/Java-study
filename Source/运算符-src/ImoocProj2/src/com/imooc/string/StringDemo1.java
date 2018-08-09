package com.imooc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		//定义一个字符串“JAVA 编程 基础”
		String str="JAVA 编程 基础";
		System.out.println(str.length());
		
		//charAt(int index)
		System.out.println(str.charAt(6));
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5, 8));

	}

}
