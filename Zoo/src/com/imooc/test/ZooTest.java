package com.imooc.test;

import java.util.Scanner;

import com.imooc.zoo.*;


public class ZooTest {
    public void show(){
        System.out.println("********欢迎来到太阳马戏团********");
        System.out.println("********   请选择表演者     ********");
        System.out.println("********     1、棕熊          ********");
        System.out.println("********     2、狮子          ********");
        System.out.println("********     3、猴子          ********");
        System.out.println("********     4、鹦鹉          ********");
        System.out.println("********     5、小丑          ********");
    }
    public String error() {
    	String str="输入错误，请重新输入";
    	return str;
    }
	public static void main(String args[]) {
		ZooTest menu=new ZooTest();
		IAct iAct=null;
		menu.show();
		Scanner sc=new Scanner(System.in);
		while(true) {
		if(iAct==null) {
			int Case=sc.nextInt();
		switch(Case) {
			case 1:
				iAct=new bear("Bill",1);
				break;		
			case 2:
				iAct=new lion("Lain",2,"灰色","公狮");
				break;
			case 3:
				iAct=new monkey("Tom",1,"金丝猴");
				break;
			case 4:
				iAct=new parrot("Rose",1,"牡丹鹦鹉");
				break;
			case 5:
				iAct=new clown("Kahle",5);
				break;
			default:
				System.out.println("输入错误请重新输入");
				continue;
			}
		System.out.println(iAct.act());
		}
		if(iAct!=null) {
			System.out.println("是否继续观看1/0");
			int sc1=sc.nextInt();
			if(sc1==1) {
				iAct=null;
				menu.show();
				continue;
			}else if(sc1==0) {
				System.out.println("欢迎下次光临");
				break;
			}else {
				System.out.println("输入错误，请重新输入");
			}
		}
	}
	}
}
