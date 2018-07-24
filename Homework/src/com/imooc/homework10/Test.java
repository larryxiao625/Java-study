package com.imooc.homework10;

import java.util.Random;

public abstract class Test {

	public static void main(String[] args) {
		Animal[] temp=new Animal[5];
		for(int i=0;i<temp.length;i++) {
            int num = new Random().nextInt(3);
	        switch(num) {
	        case 0:temp[i]=new Cat();break;
	        case 1:temp[i]=new Dog();break;
	        case 2:temp[i]=new Sheep();break;
	        }
	        
		}
		for(int i=0;i<temp.length;i++) {
			temp[i].cry();
		}

	}

}
