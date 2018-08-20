package com.imooc.thread;
class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println(getName()+"正在打印"+i);
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1=new MyThread("打印机");
		mt1.start();
	}

}
