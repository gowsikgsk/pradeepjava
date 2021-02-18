package com.basics.pradeep;

public class MethodCallingMethod {
	void m()
	{
	System.out.println("hi");
	n();
	}
	void n()
	{
		System.out.println("hello");
		//m();
	}
	public static void main(String[] args) {
		MethodCallingMethod obj= new MethodCallingMethod();
		obj.m();
		//obj.n();
	}

}
