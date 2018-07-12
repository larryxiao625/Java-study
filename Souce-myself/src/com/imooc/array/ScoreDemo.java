package com.imooc.array;

import java.util.Scanner;

public class ScoreDemo {

	public static void main(String[] args) {
		//定义一个三行两列的整型二维数组intArray
		int[][] intArray=new int[3][2];
		//从键盘输入学生成绩
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<intArray.length;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的语文成绩");
			intArray[i][0]=sc.nextInt();
			System.out.println("请输入第"+(i+1)+"个学生的数学成绩");
			intArray[i][1]=sc.nextInt();
		}
		int sumch=0,avech=0;
		sumch=intArray[0][0]+intArray[1][0]+intArray[2][0];
		avech=sumch/3;
		int summa=0,avema=0;
		summa=intArray[1][1]+intArray[1][1]+intArray[2][1];
		avema=summa/3;
		System.out.println("语文的总成绩为"+sumch);
		System.out.println("语文的平均分为"+avech);
		System.out.println("数学的总成绩为"+summa);
		System.out.println("数学的平均分为"+avema);
	
		
		
		
	}

}
