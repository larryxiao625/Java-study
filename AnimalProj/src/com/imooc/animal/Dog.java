package com.imooc.animal;

public class Dog extends Animal {
	private String sex;// 性别

	public Dog() {

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// 睡觉的方法
	public void sleep() {
		super.eat();//调用的是哪个的eat
		System.out.println(this.getName() + "现在" + this.getMonth() + "个月大");
	}
	/*
	 * 方法重载
	 * 1、在同一个类中
	 * 2、方法名相同，参数列表不同
	 * 3、返回值不做限制、访问修饰符任意
	 * 4、与方法的参数名无关
	 * 
	 * 方法重写
	 * 1、有继承关系的子类中
	 * 2、方法名相同，参数列表相同（参数顺序，个数，类型）、方法返回值相同
	 * 3、方法的访问修饰符是可以允许有变化的,访问范围要大于等于父类的方法
	 * 4、与方法的参数名无关
	 */
//	private String sleep(String name) {
//		return "";
//	}
//	
//	public void sleep(String name,int month) {
//		
//	}
//	public void sleep(int month,String name) {
//		
//	}
//	public void sleep(int name,String month) {
//		
//	}
	//子类重写父类特有的吃东西方法
	public void eat() {
		System.out.println(this.getName()+"最近没有食欲~~~~~");
	}
	
	public void eat(String name1) {
		System.out.println(this.getName()+"最近没有食欲~~~~~");
	}

}
