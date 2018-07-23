package com.imooc.homework4;

public class Test {

	public static void main(String[] args) {
		NonMotor n=new NonMotor("天宇","红",4,2);
		Bicycle b=new Bicycle("捷安特","黄");
		ElectricVehicle e=new ElectricVehicle("飞鸽");
		Tricycle t=new Tricycle();
		System.out.println("父类信息测试：");
		System.out.println(n.work());
		System.out.println("自行车类信息测试:");
		System.out.println(b.work());
		System.out.println("电动车类信息测试：");
		System.out.println(e.work());
		System.out.println("三轮车类信息测试:");
		System.out.println(t.work());
	}

}
