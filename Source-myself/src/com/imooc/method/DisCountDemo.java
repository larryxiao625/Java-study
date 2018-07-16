package com.imooc.method;

import java.util.Scanner;

public class DisCountDemo {
    //根据商品总价输出折后总价
    public void output(double a){
        if(a<100){
            System.out.println("折后商品的总价为"+a);
        }if(a>100&a<=199){
            a=a*0.95;
            System.out.println("折后商品的总价为"+a);
        }else{
            a=a*0.85;
            System.out.println("折后商品的总价为"+a);
        }
    }
	public static void main(String[] args) {
		//定义对象
		int a;
		//定义商品总价存放到变量中
		System.out.println("输入商品的价格");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		DisCountDemo sc=new DisCountDemo();

		//调用方法，输出折后商品总价
		sc.output(a);
	}
}

