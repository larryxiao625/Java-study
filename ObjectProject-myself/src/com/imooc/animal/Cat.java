package com.imooc.animal;//定义包

/**
 * 宠物猫类
 * @author ray
 *
 */
//只能有静态属性，静态方法，不能有静态类
public class Cat {
	//属性：昵称，年龄，体重，品种
	//修改属性的可见性--private(限定只能在当前类内访问)
	private String name;//昵称
	private int month;//年龄
	private double weight;//体重
	private String species;//品种
	
	//static:静态 静态成员、类成员
	//static+属性-->静态属性
	public static int price;//售价
	public Cat() {
		//static+方法内的局部变量也不行
//		static int temp=14;
//		System.out.println("我是无参构造");

	}
	{
		System.out.println("我是构造代码块");
	}//构造代码块
	//创建get/set方法
	//在get/set方法中添加对属性的限定
	//set设置属性
	public void setName(String name) {
 		this.name=name;
	}
	//get带出属性
	public String getName() {
		return "我是一只名叫:"+this.name+"的猫咪";
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<=0) {
			System.out.println("信息输入错误,宠物猫年龄必须大于0");
		}else {
		this.month = month;
		} 
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Cat(String name) {
		System.out.println("我是带参构造");
	}
	public Cat(String name,int month,double weight,String species) {
		this();
		this.name=name;
		this.month=month;
		this.weight=weight;
		this.species=species;
	}
	
//	public void Cat() {
//		System.out.println("我只是一个普通方法");
//	}
	//方法:跑动、吃东西
	//跑动的方法
	//在成员方法中，可以直接访问类中的静态成员
	public void run() {
		Cat.eat();
		this.name="妞妞";//静态方法中不能使用this
		this.price=20;
//		name="小胖";
		price=1000;
		System.out.println("售价"+Cat.price+"的"+this.name+"小猫快跑");
	}
	//跑动方法重载
	public void run(String name) {
		{
			int temp=12;
			System.out.println("我是普通代码块1"+temp);
		}
		System.out.println(name+"快跑");
		{
			int temp=13;
			System.out.println("我是普通代码块2"+temp);
		}
	}
	//吃东西的方法
	//static+方法->类方法，静态方法
	public static void eat() {
		System.out.println("小猫吃鱼");
	}

}
