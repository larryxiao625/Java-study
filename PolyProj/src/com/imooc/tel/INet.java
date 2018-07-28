package com.imooc.tel;

public interface INet {
	/*
	 * 接口中抽象方法可以不写abstarct关键字
	 * 访问修饰符默认public
	 * 当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
	 */
	public abstract void network();
	void connection();
}
