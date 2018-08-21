package com.imooc.file;
import java.io.*;
public class FileTest {

	public static void main(String[] args) {
		File file =new File("/Users/ray/Desktop/imooc/FileProj/bin/com/imooc/file/Mondy.docx");
		while(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		while(file.exists()) {
			System.out.println("创建文件成功!");
			System.out.println("文件名称："+file.getName());
			System.out.println("文件上一级目录："+file.getPath().substring(48,52));
			System.out.print("文件/目录：");
			if(file.isDirectory()==true) {
				System.out.print("这是一个目录");
			}else if(file.isFile()==true) {
				System.out.print("这是一个文件");
				System.out.println();
			}
			while(file.canWrite()&&file.canRead()) {
				System.out.println("这个文件即可以读还可以写");
				break;
			}
			break;
		}
		
	}
}
