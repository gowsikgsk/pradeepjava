package com.basics.pradeep.multithreading; 
//independent threads

class A extends Thread 
{
	public void run() 
	{
		for (int num = 1; num <= 100; num++) 
		{
			if (num==50)
			{
				stop();
			}
			
			int count = 0;
			for (int i = 2; i < num; i++) 
			{
				if (num % i == 0) 
				{
					count = count + 1;
				}
			}
			if (count == 0) 
			{
				System.out.println("prime number" + num);
			} 
			else 
			{
				// System.out.println("non prime number"+num);
			}
		}
	}
}

class B extends Thread 
{
	public void run() 
	{
		for (int num = 1; num <= 1000; num++) 
		{
			int sum = 0;
			for (int i = 1; i < num; i++) 
			{
				if (num % i == 0) 
				{
					sum = sum + i;
				}
			}
			if (num == sum) 
			{
				System.out.println("perfect number" + num);
			} 
			else 
			{
				// System.out.println("not a perfect number" + num);
			}
		}
	}
}

class C extends Thread 
{
	public void run() 
	{
		int num = 12;
		int out = 1;
		for (int i = 1; i <= num; i++) 
		{
			out = out *i;
		}
		System.out.println(out);
	}
}

public class MT 
{
	public static void main(String[] pradeep) 
	{
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}
}