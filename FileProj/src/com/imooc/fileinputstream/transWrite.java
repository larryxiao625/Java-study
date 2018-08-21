package com.imooc.fileinputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class transWrite {
	public static void transWriteByBuff(String str) throws IOException {
		FileOutputStream fos=new FileOutputStream("test1.txt");
		OutputStreamWriter fow=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(fow);
		bw.write(str);
		bw.close();
		fow.close();
		fos.close();
		
		
	}
	
	public static String transReadByBuff() throws IOException {
		FileInputStream fis=new FileInputStream("test1.txt");
		InputStreamReader isp=new InputStreamReader(fis);
		BufferedReader nr=new BufferedReader(isp);
		String str=nr.readLine();
		String str2=nr.readLine();
		nr.close();
		isp.close();
		fis.close();
		return str+"\n"+str2;

		
	}
	
	public static void main(String[] args) {
		try {
			transWriteByBuff("你好吗？\n 我很好");
			System.out.print(transReadByBuff());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
