package com.homework.weather;
/**
 * 
 * @author ray
 *
 */
public class ReadWeather implements Runnable {
	Weather weather;

	public ReadWeather(Weather weather) {
		this.weather = weather;
	}

	public ReadWeather() {

	}
	/**
	 * 循环一百次获取温度湿度数据
	 */
	public void run() {
		for (int i = 0; i < 100; i++) {
			weather.read();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
