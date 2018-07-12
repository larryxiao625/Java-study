package com.imooc.array;

public class ArrayDemo4 {

	public static void main(String[] args) {
		//二维数组的声明
		//三种形式
		//声明int类型的二维数组
		int[][] intArray;
		//声明float类型的二维数组
		float floatArray[][];
		//声明double类型的二维数组
		double[] doubleArray[];
		//创建一个三行三列的int类型的数组
		intArray=new int[3][3];
		System.out.println("intArray数组的第3行第2列的元素为:"+intArray[2][1]);
		//为第2行第3个元素赋值为9
		intArray[1][2]=9;
		System.out.println("intArray数组第2行第3列的元素为:"+intArray[1][2]);
		//声明数组的同时进行创建
		char[][] ch=new char[3][5];
		//创建float类型的数组时，只指定行数
		floatArray=new float[3][];
		//System.out.println(floatArray[0][0]);
		//每行相当于一个一维数组，创建
		floatArray[0]=new float[3];//第一行有3列
		floatArray[1]=new float[4];//第二行有4列
		floatArray[2]=new float[5];//第三行有5列
		System.out.println(floatArray[0][0]);
		//二维数组的初始化
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("num数组第1行第2列的元素为："+num[0][1]);
		System.out.println("num数组的行数:"+num.length);
		System.out.println("num数组的列数为:"+num[0].length);
		int[][] num1= {{78,98},{65,75,63},{98}};
		System.out.println("num1数组的第一行的列数:"+num1[0].length);
		//循环输出二维数组的内容
		//外重循环控制行数
		for(int i=0;i<num1.length;i++) {
			//内重控制列数
			for(int j=0;j<num1[i].length;j++) {
				System.out.print(num1[i][j]+"   ");
			}
			System.out.println();
		}
		
		//使用增强型for循环
		for(int[] i:num1) {
			for(int j:i) {
				System.out.print(j+"   ");
			}
			System.out.println();
		}

		
	}

}
