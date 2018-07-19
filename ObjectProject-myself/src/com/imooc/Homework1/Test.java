package com.imooc.Homework1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User one=new User();
		User two=new User();
		UserManager check=new UserManager(); 
		one.setName("Lucy");
		one.setPassword(123456);
		two.setName("Mike");
		two.setPassword(123456);
		System.out.println("用户名："+one.getName());
		System.out.println("密码:"+one.getPassword());
		System.out.println("用户名："+two.getName());
		System.out.println("密码:"+two.getPassword());
		System.out.println("===========");
		System.out.println(check.checkUser(one, two));
	}

}
