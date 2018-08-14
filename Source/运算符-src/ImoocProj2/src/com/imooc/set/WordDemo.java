package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("blue");
		set.add("red");
		set.add("black");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"   ");
		}
		set.add("green");
	}

}
