package com.imooc.Homework1;

public class UserManager {
	public String checkUser(User one,User two) {
		
		if(one.getName()=="Lucy"&&two.getName()=="Mike"){
			return "用户名一致";
		}else {
			return "用户名不一致";
		}
	}
}
