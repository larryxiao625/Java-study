package com.imooc.string;

public class StringTest {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("欢迎来到");
		str1.append("imooc");
		System.out.println(str1.toString());
		StringBuilder str2=str1.delete(0, 4).insert(0, "你好，");
		System.out.println(str2.toString());
		StringBuilder str3=str2.replace(0, 3, "欢迎来到");
		System.out.println(str3.toString());
	

	}

}
