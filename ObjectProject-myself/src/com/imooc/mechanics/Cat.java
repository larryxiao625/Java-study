package com.imooc.mechanics;

public class Cat {
	//属性：昵称，年龄，体重，品种
	//修改属性的可见性--private(限定只能在当前类内访问)
	private String name;//昵称
	private int month;//年龄
	private double weight;//体重
	private String species;//品种
	
	public Cat() {
		System.out.println("我是宠物猫~~~~");
	}
	
	public Cat(int month) {
		
	}
}
