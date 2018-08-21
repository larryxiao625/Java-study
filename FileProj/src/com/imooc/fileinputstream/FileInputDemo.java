package com.imooc.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileInputDemo {

	public static void main(String[] args) {
		try {
			int n=0;
			FileInputStream file=new FileInputStream("/Users/ray/Desktop/imooc/FileProj/src/com/imooc/fileinputstream/test.txt");
			List<Character> list=new ArrayList<Character>();
			while((n=(file.read()))!=-1) {
				list.add((char)(n));
			}
			Iterator<Character> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
