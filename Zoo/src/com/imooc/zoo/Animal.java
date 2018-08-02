package com.imooc.zoo;

public abstract class Animal {
	/**
	 * 父类共有信息：姓名，年龄
	 */
	private String name;
	private int age;
	public Animal(){
		
	}
	/**
	 * 
	 * @param name姓名
	 * @param age年龄
	 */
	public Animal(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract String love();
	
}
