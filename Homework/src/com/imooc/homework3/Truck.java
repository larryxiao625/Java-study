package com.imooc.homework3;

public class Truck extends Car{
	double weight;
	public Truck() {
		
	}
	public Truck(String color,String motor,double weight) {
		super(color,motor);
		this.weight=weight;
		
	}
	public void display() {
		System.out.println("颜色"+this.color+"发动机"+this.motor+"载重量"+this.weight);
	}
	public static void main(String[] args) {
		Truck truck=new Truck("红色","育才",1.5);
		truck.display();

	}

}
