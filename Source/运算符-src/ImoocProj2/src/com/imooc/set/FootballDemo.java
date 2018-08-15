package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> match=new HashMap<Integer,String>();
		match.put(2014, "德国");
		match.put(2010, "西班牙");
		match.put(2006,"意大利");
		Iterator<String> set=match.values().iterator();
		System.out.println("使用迭代器进行输出");
		while(set.hasNext())
			System.out.println(set.next());
		Set<Entry<Integer,String>> set1=match.entrySet();
		for(Entry<Integer,String> entry:set1) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	}

}
