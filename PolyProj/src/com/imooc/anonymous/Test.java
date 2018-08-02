package com.imooc.anonymous;

import com.imooc.anonymous.BallTest.Inner_m;

public class Test {

	public static void main(String[] args) {
		BallTest ba=new BallTest();
		
		Object m = ba.getInner_m();
		System.out.println(((Inner_m) m).play());
		BallTest.Inner_m ba1=new BallTest().new Inner_m();
		System.out.println(ba1.play());
		Object ba2=ba.new Inner_m();
		System.out.println(((Inner_m) ba2).play());
		System.out.println("**************");
		System.out.println(ba.info());
		System.out.println("**************");
		ba.playBall(new Ball() {

			@Override
			public String play() {
				// TODO Auto-generated method stub
				return "匿名内部类\n打排球";
			}
			
		});
		
		
		
	}

}
