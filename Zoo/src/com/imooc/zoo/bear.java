package com.imooc.zoo;

public class bear extends Animal implements IAct {
	public bear() {

	}
	/**
	 * 
	 * @param name姓名
	 * @param age年龄
	 */
	public bear(String name, int age) {
		super(name, age);
	}

	public String skill() {
		String str = "挽着花篮，打着雨伞，自理走秀";
		return str;
	}

	public String love() {
		String str = "爱好卖萌";
		return str;
	}

	public String act() {
		// TODO Auto-generated method stub
		String str = "表演者：" + this.getName() + "\n年龄:" + this.getAge() + "\n技能:" + this.skill() + "\n爱好:" + this.love();
		return str;
	}

}
