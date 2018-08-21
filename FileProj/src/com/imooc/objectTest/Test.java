package com.imooc.objectTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Product iphone=new Product("123","iphone","telephone","4888.0");
		Product ipad=new Product("234","ipad","computer","5088.0");
		Product macbook=new Product("345","macbook","computer","6000.0");
		try {
			FileOutputStream ops = new FileOutputStream("test2.txt");
			ObjectOutputStream oos=new ObjectOutputStream(ops);
			oos.writeObject(iphone);
			oos.writeObject(ipad);
			oos.writeObject(macbook);
			oos.flush();
			ops.close();
			FileInputStream fis=new FileInputStream("test2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);

			while(fis.available()>0) {
				Product p=(Product)ois.readObject();
				System.out.println(p);
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
