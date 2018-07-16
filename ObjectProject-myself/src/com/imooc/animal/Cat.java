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
	//方法:跑动、吃东西
	//跑动的方法
	public void run() {
		System.out.println("小猫快跑");
	}
	//吃东西的方法
	public void eat() {
		System.out.println("小猫吃鱼");
	}

}
