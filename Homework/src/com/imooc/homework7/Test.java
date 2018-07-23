package com.imooc.homework7;

public class Test {

	public static void main(String[] args) {
		Car one=new Car("绿","花花");
		Car two=new Car("绿","花花");
		one.use();
		System.out.println("car1和car2的引用比较:"+one.equals(two));
		System.out.println("=======================");
		Taxi three=new Taxi("蓝色","张小泉","长生");
		System.out.println(three.ride());
		three.use();
		System.out.println(three.toString());
		System.out.println("=======================");
		HomeCar four=new HomeCar("紫色","孙二娘",7);
		four.display();
		four.display(7);
	}

}
