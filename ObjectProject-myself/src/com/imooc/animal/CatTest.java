package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		//对象实例化操作
//		Cat one=new Cat("花花",2,1000,"英国短毛猫");
//		Cat two=new Cat();
		Cat one=new Cat();
		Cat two=new Cat();
//		Cat one;//声明对象
//		测试
//		one.eat();
//		one.run();
		one.setName("花花");
		one.setMonth(-2);
		one.setWeight(1000);
		one.setSpecies("英国短毛猫");
//		two.name="凡凡";
//		two.month=1;
//		two.weight=800;
//		two.species="中华田园猫";
		System.out.println("昵称："+one.getName());
		System.out.println("昵称："+one.getMonth());
		System.out.println("昵称："+one.getWeight());
		System.out.println("昵称："+one.getSpecies());
		System.out.println("--------------------");	
		one.run(one.getName());
		one.run();
	}

}
