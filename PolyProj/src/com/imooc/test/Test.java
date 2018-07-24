package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal one=new Animal();//1
		/*向上转型、隐式转型、自动转型--》父类引用指向子类实例
		小类转型为大类
		可以调用子类重写弗雷德方法以及父类派生的方法
		无法调用子类独有方法
		*/
		Animal two=new Cat();//2
		Animal three=new Dog();//3
		one.eat();
		two.eat();
		three.eat();
		System.out.println("===================");
		/*向下转型，强制类型转换
		 * 子类引用指向父类对象，此处必须进行强转，可以调用子类特有方法
		 * 必须满足一定条件才可以进行强转
		 * instanceof
		 */
		if(two instanceof Cat) {
		Cat temp=(Cat)two;//相当于将向上转型后的two转换回cat类型
		temp.eat();
		temp.run();
		temp.getMonth();
		System.out.println("two可以转换为Cat类型");
		}if(two instanceof Dog){
			Dog temp2=(Dog)two;
			System.out.println("TWO可以转换为Dog类型");
		}
//		Dog temp2=(Dog)two;
//		temp2.eat();
//		temp2.sleep();
		if(two instanceof Animal) {
			System.out.println("Animal");
		}
		if(two instanceof Object) {
			System.out.println("Object");
		}
	}

}
