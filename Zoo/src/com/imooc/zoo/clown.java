package com.imooc.zoo;

public class clown implements IAct {
	private String name;
	private int age;

	public clown() {

	}
	
	public clown(String name, int age) {
		this.setAge(age);
		this.setName(name);
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

	public String skill() {
		String str = "脚踩高跷，进行杂技魔术表演";
		return str;
	}

	public String dress() {
		String str = "身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
		return str;
	}

	public String act() {
		String str = "表演者：" + this.getName() + "\n艺龄:" + this.getAge() + "\n技能:" + this.skill() + "\n爱好:"
				+ this.dress();
		return str;
	}

}
