package com.basics.pradeep;

public class A 
{
 	 public void m()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		/*A a = new A();
		 a.m();*/
		         
		B b = new B();
		  b.m();
		  b.n();
		  		  
		C c = new C();
		  c.m();
		  c.n();
		  c.o();
	}
}
class B extends A
{
	public void n()
	{
		System.out.println("hey");
	}
}
//class C extends A
class C extends B
{
	void o()
	{
		System.out.println("hello");
	}
}