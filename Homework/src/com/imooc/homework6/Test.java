package com.imooc.homework6;

public class Test {

	public static void main(String[] args) {
		Fruits one=new Fruits("圆形","甜");
		Fruits two=new Fruits("圆形","甜");
		one.eat();
		System.out.println(one.eauqls(two));
		System.out.println("=============================");
		Waxberry berry=new Waxberry("圆形","酸甜适中","紫红色");
		berry.face();
		berry.eat();
		System.out.println(berry.toString());
		System.out.println("=============================");
		Banana banana=new Banana("形短而稍圆","果肉香甜","仙人蕉");
		banana.advantage();
		banana.advantage("黄色");


	}

}
