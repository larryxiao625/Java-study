package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// 设置要猜的数
		//int number=6;
		int number=(int)(Math.random()*10+1); //范围为[0,1),Math.random为double类型
		System.out.println("number="+number);
		int guess;
		System.out.println("猜一个介于1到10之间的数");
		do {
			Scanner s=new Scanner(System.in);
			guess=s.nextInt();
			if(guess>number) {
				System.out.println("太大啦");
			}else{
				System.out.println("太小啦");
			}
		}while(number!=guess);
		System.out.println("猜对啦！");
		

	}

}
