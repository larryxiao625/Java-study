package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		//对象实例化操作
		Cat one=new Cat("花花",2,1000,"英国短毛猫");
//		Cat two=new Cat();
		Cat two=one;
//		Cat one;//声明对象
		//测试
//		one.eat();
//		one.run();
//		one.name="花花";
//		one.month=2;
//		one.weight=1000;
//		one.species="英国短毛猫";
//		two.name="凡凡";
//		two.month=1;
//		two.weight=800;
//		two.species="中华田园猫";
		System.out.println("昵称："+one.name);
		System.out.println("昵称："+one.month);
		System.out.println("昵称："+one.weight);
		System.out.println("昵称："+one.species);
		System.out.println("--------------------");
		System.out.println("昵称："+two.name);
		System.out.println("昵称："+two.month);
		System.out.println("昵称："+two.weight);
		System.out.println("昵称："+two.species);		
		one.run(one.name);
		one.run();
	}

}
