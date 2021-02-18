package com.basics.pradeep.multithreading;
import java.io.FileReader;
import java.io.FileWriter;

class X extends Thread
{
	public synchronized void run()
	{
		try
		{
			FileReader fr = new FileReader("C:/Users/sys/Desktop/pay.txt");
			int i;
			while ((i = fr.read()) != -1) 
			{
				System.out.print((char) i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Y extends Thread
{
	public synchronized void run()
	{
		try
		{
		FileWriter fw = new FileWriter("C:/Users/sys/Desktop/pay.txt");
		String s = "pradeepramesh123";
		fw.write(s);
		fw.flush();
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Z extends Thread
{
	public synchronized void run()
	{
		try
		{
			FileReader fr = new FileReader("C:/Users/sys/Desktop/pay.txt");
			int i;
			while ((i = fr.read()) != -1) 
			{
				System.out.print((char) i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Confusion 
{
	public static void main(String[] args) 
	{
	X x = new X();
	Y y = new Y();
	Z z = new Z();
	x.setPriority(1);
	x.start();
	y.setPriority(5);
	z.setPriority(10);
	//x.start();
	y.start();	
	z.start();
	}
}