package com.imooc.anonymous;

public class BallTest {
	public class Inner_m implements Ball{
		public String play() {
			return "成员内部类:\n打篮球";
		}
	}
	public Inner_m getInner_m() {
		return new Inner_m();
	}
	public Object info(){
		class Inner_f implements Ball{
			public String play() {
				String str="方法内部类：\n打乒乓球";
				return str;
			}
		}
		return new Inner_f().play();
	}
	public void playBall(Ball ball) {
		System.out.println(ball.play());
	}
}
