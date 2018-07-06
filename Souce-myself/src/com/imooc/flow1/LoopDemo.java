package com.imooc.flow1;

public class LoopDemo {
    public static void main(String[] args) {
		//定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
        int ge,shi,bai,he,ji,num;
		//使用for循环
        for(num=200;num<=300;num++){
			//取出百位数
		    bai=num/100;
			//取出十位数
			shi=num/10-20;
			//取出个位数
		    ge=num-(bai*100+shi*10);
			//计算三个数字之积
            ji=bai*shi*ge;
			//计算三个数字之和
			he=bai+shi+ge;
            //如果积等于42并且和为12，则将满足条件的数输出
            if(ji==42&he==12){
                System.out.println(num);
            }
        }
	}
}
