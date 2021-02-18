package com.basics.pradeep;
public class Recursion {
	void m(int x)
	{
		System.out.println(x);
		x=x+1;
		if(x<=10)
		{
			m(x);
		}
	}
	void n(int x)
	{
		System.out.println(x);
		x=x-1;
		if(x>=1)
		{
			n(x);
		}
	}
	public static void main(String[] args) {
	Recursion obj = new Recursion();
	obj.m(1);
	obj.n(10);
	}

}
