package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		Map<String,String> animal=new HashMap<String,String>();
		System.out.println("请输入三组对应的注释");
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("请输入key值");
			String key=sc.next();
			System.out.println("请输入value值");
			String value=sc.next();
			animal.put(key, value);
			i++;
		}
		System.out.println("***************");
		Iterator<String> it=animal.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"   ");
		}
		
		Set<Entry<String,String>> set=animal.entrySet();
		for(Entry<String,String> entry:set) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}

}


