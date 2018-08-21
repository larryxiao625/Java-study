package com.imooc.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("/Users/ray/Desktop/imooc/FileProj/bin/com/imooc/fileinputstream/test.txt");
			int n=0,i=0;
			while((n=(file.read()))!=-1) {
				System.out.print((char)n);
				i++;
			}
			System.out.println();
			System.out.println(i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		

	}

}
