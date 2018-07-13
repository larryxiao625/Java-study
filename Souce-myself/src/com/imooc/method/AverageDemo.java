package com.imooc.method;

public class AverageDemo {
	
	public float getave(float[] arr) {
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		float ave=sum/5;
		return ave;
	}
	public static void main(String[] args) {
		AverageDemo averagedemo=new AverageDemo();
		float[] arr={78.5f,98.5f,65.5f,32.5f,75.5f};
		System.out.println("数组的平均值为"+averagedemo.getave(arr));
		
	}

}
