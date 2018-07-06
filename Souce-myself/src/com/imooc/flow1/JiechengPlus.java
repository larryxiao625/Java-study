 package com.imooc.flow1;

public class JiechengPlus {

	public static void main(String[] args) {
		//求阶乘
		int m,n,s,sum=0;
		for(m=1;m<=5;m++) {
			s=1;
			for(n=1;n<=m;n++) {
				s=s*n;
			}
		sum=sum+s;	
		}
		System.out.println(sum);

	}

}
