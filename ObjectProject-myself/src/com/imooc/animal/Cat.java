package com.imooc.animal;
/**
 * 宠物猫类
 * @author ray
 *
 */
public class Cat {
	//属性：昵称，年龄，体重，品种
	String name;//昵称
	int month;//年龄
	double weight;//体重
	String species;//品种
	
	public Cat() {
		System.out.println("我是无参构造");

	}
	
	public Cat(String name) {
		System.out.println("我是带参构造");
	}
	public Cat(String name,int month,double weight,String species) {
		this();
		this.name=name;
		this.month=month;
		this.weight=weight;
		this.species=species;
	}
	
//	public void Cat() {
//		System.out.println("我只是一个普通方法");
//	}
	//方法:跑动、吃东西
	//跑动的方法
	public void run() {
		this.eat();
		System.out.println("小猫快跑");
	}
	//跑动方法重载
	public void run(String name) {
		System.out.println(name+"快跑");
	}
	//吃东西的方法
	public void eat() {
		System.out.println("小猫吃鱼");
	}

}
