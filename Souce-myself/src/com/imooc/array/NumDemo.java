package com.imooc.array;

public class NumDemo {

	public static void main(String[] args) {
		//定义一个字符数组ch并初始化
		char[] ch={'a','A','b','c','v','s'};
		//循环遍历数组，统计字符’a’或’A’出现的次数
		int num=0;
		 for(int a=0;a<ch.length;a++){
		     if(ch[a]=='a'|ch[a]=='A'){
		         num++;
		     }else{
		         continue;
		     }
		 }

		//打印输出统计数据
		System.out.print("字符数组中字符'a'或'A'的个数为:"+num);

	}

}
