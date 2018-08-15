package com.imooc.goods;

public class Goods {
	private int id;
	private String name;
	private double price;

	public Goods(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "商品编号：" + this.id + "商品名称：" + this.name + "商品价格：" + this.price;
	}

	public boolean equals(String str) {
		if (this.getName() == str) {
			return true;
		} else {
			return false;
		}
	}

}
