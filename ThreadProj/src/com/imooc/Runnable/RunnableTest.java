package com.imooc.Runnable;
class Cat implements Runnable{
	public Cat() {
		
	}
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"A Cat");
		}
	}
	
}
class Dog implements Runnable{
	public Dog() {
		
	}
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"A Dog");
		}
	}
}
public class RunnableTest {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Thread mt1=new Thread(cat);
		Dog dog=new Dog();
		Thread mt2=new Thread(dog);
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
		mt1.start();
		mt2.start();

	}

}
