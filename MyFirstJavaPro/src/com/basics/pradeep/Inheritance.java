package com.basics.pradeep;

public class Inheritance {
		void m()
		{
			System.out.println("hi");
		}
	public static void main(String[] args) {
		Abc abc=new Abc();
			abc.m();
			abc.n();
			
		Xyz xyz = new Xyz();
			xyz.m();
			xyz.o();
	}
}
class Abc extends Inheritance
{
	void n()
	{
		System.out.println("hey");
	}
}
class Xyz extends Inheritance
{
	void o()
	{
		System.out.println("hello");
	}
}