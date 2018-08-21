package com.homework.weather;
/**
 * 
 * @author ray
 *
 */
public class GenerateWeather implements Runnable {
	Weather weather;

	public GenerateWeather(Weather weather) {
		this.weather = weather;
	}

	public GenerateWeather() {

	}
	/**
	 * 循环一百次生成温度湿度数据
	 */
	public void run() {
		for (int i = 0; i < 100; i++) {
			weather.generate();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
