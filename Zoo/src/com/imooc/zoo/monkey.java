package com.imooc.zoo;

public class monkey extends Animal implements IAct {
	private String species;

	public monkey() {

	}

	public monkey(String name, int age, String species) {
		super(name, age);
		this.setSpecies(species);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String skill() {
		String str = "骑独轮车过独木桥";
		return str;
	}

	public String love() {
		String str = "喜欢模仿别人的动作表情";
		return str;
	}

	public String act() {
		String str = "表演者：" + this.getName() + "\n年龄:" + this.getAge() + "\n品种:" + this.getSpecies() + "\n技能:"
				+ this.skill() + "\n爱好:" + this.love();
		return str;
	}

}
