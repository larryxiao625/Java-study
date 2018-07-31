package com.imooc.test;

public interface iFather2 {
	void fly();
	
	default void connection() {
		System.out.println();
	}
}
