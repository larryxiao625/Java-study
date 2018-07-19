package com.imooc.test;

public class CodeBlock {
	{
		System.out.println("CodeBlock的构造快");
	}
	static {
		System.out.println("CodeBlock的静态代码块");
	}
	public CodeBlock() {
		System.out.println("CodeBlock的构造方法");
	}
	public static void main(String[] args) {
		System.out.println("CodeBlock的主方法");
		System.out.println("产生Code类实例对象");
		Code sc=new Code();
		System.out.println("产生Codeblock类实例对象");
		CodeBlock s=new CodeBlock();
		

	}

}
