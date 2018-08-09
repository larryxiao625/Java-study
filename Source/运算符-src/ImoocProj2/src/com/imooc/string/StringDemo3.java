package com.imooc.string;

public class StringDemo3 {
	public static void main(String[] args) {
		String str=new String();
		str="abcdefg";
		System.out.println(str.substring(2,5).toUpperCase());
		System.out.println(str.substring(2,5).toUpperCase().replaceAll("DE", "MM"));
		
	}
}
