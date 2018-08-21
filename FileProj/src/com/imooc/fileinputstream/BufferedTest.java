package com.imooc.fileinputstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("/Users/ray/Desktop/imooc/FileProj/src/com/imooc/fileinputstream/one.txt");
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("/Users/ray/Desktop/imooc/FileProj/src/com/imooc/fileinputstream/two.txt"));
			byte[] b=new byte[999999];
			for(int i=0;i<b.length;i++) {
				b[i]=100;
			}
			long time1s=(System.currentTimeMillis());
			fos.write(b);
			long time1e=System.currentTimeMillis();
			System.out.println("不使用缓冲流写用时为："+(time1e-time1s));
			long time2s=(System.currentTimeMillis());
			bos.write(b);
			bos.flush();
			long time2e=System.currentTimeMillis();
			System.out.println("使用缓冲流写用时为："+(time2e-time2s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		
	}

}
