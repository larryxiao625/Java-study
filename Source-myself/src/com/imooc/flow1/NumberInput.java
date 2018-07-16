package com.imooc.flow1;

import java.util.Scanner;

public class NumberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		while(true) {
		    int n=s.nextInt();
		    if(n==0)break;
			System.out.println(n);
		}
		

	}

}
