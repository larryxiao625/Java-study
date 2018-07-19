package com.imooc.test;
//import com.imooc.animal.*;//加载com.imooc.animal下所有类
import com.imooc.animal.Cat;//加载com.imooc.animal下指定的Cat类
public class Test {

	public static void main(String[] args) {
		Cat one=new Cat();
		one.setName("花花");
		one.setMonth(2);
		one.setSpecies("英国短毛猫");
		//静态成员访问方法：对象名、类名
		one.price=2000;
		Cat.price=3000;
		one.eat();
		Cat.eat();//推荐这种
		one.run();
		Cat two=new Cat();
		two.setName("凡凡");
		two.setMonth(1);
		two.setSpecies("中华田园猫");
		two.price=150;
		one.run("花花");
		System.out.println(one.getName()+"的售价"+one.price);
		System.out.println(two.getName()+"的售价"+two.price);
	}

}
