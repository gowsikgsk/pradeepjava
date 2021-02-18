package com.basics.pradeep;

public class Test {

	public static void main(String[] args) {
		/*char symbol='+';
		switch(symbol)
		{
		case '+':
			System.out.println("+");
		case '-':
			System.out.println("-");
		case '%':
			System.out.println("%");
		}*/
		

		long startTime = System.nanoTime();
		for(int i=1;i<=10000000;i++)
		{
			System.out.println(i);
		}
		//.....your program....
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);

		
		/*for(int i=1;i<=10000000;i++)
		{
			System.out.println(i);
		}*/
}
	}