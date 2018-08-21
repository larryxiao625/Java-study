
package com.homework.weather;

import java.util.Random;
/**
 * 
 * @author ray
 *
 */
public class Weather {
	/**
	 * 定义温度（temperature），湿度（humidity）成员属性
	 */
	private int temperature;
	private int humidity;
	boolean flag = false;
	Random random = new Random();

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	/**
	 * 生成天气数据
	 */
	public synchronized void generate() {
		/**
		 * 使用notifyAll防止死锁
		 * flag代表数据存储状态
		 */
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.setTemperature(random.nextInt(40));
		this.setHumidity(random.nextInt(100));
		System.out.println("生成天气数据【温度：" + this.getTemperature() + ",湿度：" + this.getHumidity() + "]");
		this.flag = true;
		notifyAll();
	}
	/**
	 * 获取天气数据
	 * flag代表数据存储状态
	 */
	public synchronized void read() {
		while (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("读取天气数据[温度：" + this.getTemperature() + ",湿度：" + this.getHumidity() + "]");
		this.flag = false;
		/**
		 * 使用notifyAll方法防止死锁
		 */
		notifyAll();
	}
	/**
	 * 重写toString方法
	 */
	public String toString() {
		String str = "读取天气数据[温度：" + this.getTemperature() + "，湿度：" + this.getHumidity() + "]";
		return str;

	}

}
