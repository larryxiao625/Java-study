package com.imooc.flow1;

public class PlusDemo {

	public static void main(String[] args) {
		//求1到5的累加和
		int a=1;
		int sum=0;//sum是存放和的变量
		while(a<=5) {
			sum=sum+a;
			a++;
		}
		System.out.println("1到5的累加和是"+sum);
	}

}
