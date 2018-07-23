package com.imooc.homework6;

final public class Waxberry extends Fruits {
	private String color;
	public Waxberry() {

	}
	
	public Waxberry(String shape,String taste,String color) {
		super(shape,taste);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public final void face() {
		System.out.println("杨梅：" + this.color + "、" + this.getShape() + "," + "果味"+this.getTaste() );
	}
	
	public void eat() {
		System.out.println("杨梅酸甜适中，非常好吃!");
	}
	
	public String toString() {
		String str="杨梅的信息：果实为"+this.getShape()+"、"+this.getColor()+"、"+this.getTaste()+",非常好吃！";
				return str;
	}
	
	
}
