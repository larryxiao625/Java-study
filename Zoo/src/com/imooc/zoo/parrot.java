package com.imooc.zoo;

public class parrot extends Animal implements IAct{
	String species;
	public parrot() {
		
	}
	public parrot(String name,int age,String species) {
		super(name,age);
		this.setSpecies(species);
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String skill() {
		String str="擅长模仿";
		return str;
	}
	public String love() {
		String str="喜欢吃坚果和松子";
		return str;
	}
	public String act() {
		String str = "表演者：" + this.getName() + "\n年龄:" + this.getAge() + "\n品种:" + this.getSpecies() + "\n技能:"
				+ this.skill() + "\n爱好:" + this.love();
		return str;
	}
	
}
