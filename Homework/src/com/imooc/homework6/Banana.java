package com.imooc.homework6;

public class Banana extends Fruits{
	private String variety;

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
	public Banana() {
		
	}
	public Banana(String shape,String taste,String variety) {
		super(shape,taste);
		this.variety=variety;
	}
	public void advantage() {
		System.out.println(this.variety+"果形"+this.getShape()+","+this.getTaste()+",可供生食");
	}
	public void advantage(String color) {
		System.out.println(this.getVariety()+"颜色为"+color);
	}
}
