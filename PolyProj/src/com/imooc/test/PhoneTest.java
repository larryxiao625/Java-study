package com.imooc.test;

import com.imooc.tel.Camera;
import com.imooc.tel.FourthPhone;
import com.imooc.tel.iPhoto;

public class PhoneTest {

	public static void main(String[] args) {
		FourthPhone phone =new FourthPhone();
		phone.photo();

		iPhoto ip=new FourthPhone();
		ip.photo();
		ip=new Camera();
		ip.photo();
	}

}
