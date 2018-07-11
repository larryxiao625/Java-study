package com.imooc.array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		//求数组元素的最大值
		int[] a={1,2,3,4,5,6,7,8,9};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}else {
				continue;
			}
		}
		System.out.println(max);
	}

}
