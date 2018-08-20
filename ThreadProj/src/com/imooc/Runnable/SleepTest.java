package com.imooc.Runnable;
class Letter implements Runnable{
	char[] letter=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public void run() {
		for(int i=0;i<26;i++) {
			System.out.print(letter[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SleepTest {
	public static void main(String[] args) {
		Letter letter=new Letter();
		Thread mt=new Thread(letter);
		mt.start();
	}
}
