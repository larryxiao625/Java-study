package com.imooc.objectTest;

import java.io.Serializable;

public class Product implements Serializable{
	private String id,name,categories,price;
	public Product (String id,String name,String categories,String price) {
		this.id=id;
		this.name=name;
		this.categories=categories;
		this.price=price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String toString() {
		String str;
		return str="产品ID:"+this.getId()+"\n产品名称"+this.getName()+"\n产品属性"+this.getCategories()+"\n产品价格"+this.getPrice();
	}

}
