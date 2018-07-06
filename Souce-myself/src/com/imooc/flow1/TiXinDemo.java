package com.imooc.flow1;

public class TiXinDemo {

	public static void main(String[] args) {
		int n=1,m=9;
		for(int i=1;i<=5;i++) {
			n=n+2;
			m=m-1;
			for(int l=1;l<=m;l++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
