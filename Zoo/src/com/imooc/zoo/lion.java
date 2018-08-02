package com.imooc.zoo;

public class lion extends Animal implements IAct {
	private String color, sex;

	public lion() {

	}

	public lion(String name, int age, String color, String sex) {
		super(name, age);
		this.setColor(color);
		this.setSex(sex);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String skill() {
		String str = "擅长钻火圈";
		return str;
	}

	public String act() {
		String str = "表演者：" + this.getName() + "\n年龄:" + this.getAge() + "\n性别：" + this.getSex() + "\n毛色:"
				+ this.getColor() + "\n技能:" + this.skill() + "\n爱好:" + this.love();
		return str;
	}

	@Override
	public String love() {
		String str = "喜欢吃各种肉类";
		return str;
	}

}
