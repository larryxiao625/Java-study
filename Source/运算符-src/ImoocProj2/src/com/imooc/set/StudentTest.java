package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		Student three=new Student(3,"William",63.0f);
		Student one=new Student(1,"Tom",87.0f);
		Student two=new Student(2,"Lucy",95.0f);
		set.add(one);
		set.add(two);
		set.add(three);
		Iterator<Student> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println("=================================");
		Student four=new Student(2,"Lucy",95.0f);
		set.add(four);
		it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}
