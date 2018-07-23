package com.imooc.test;

import com.imooc.singleton.SingletonOne;

public class Test {

	public static void main(String[] args) {
		SingletonOne one=SingletonOne.getInstance();
		SingletonOne two=SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);

	}

}
