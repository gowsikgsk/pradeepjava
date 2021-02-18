package com.basics.pradeep;

public class PracticePrograms {

	public static void main(String[] args) {
	
/*//program:1		
//print 1to10 wihtout using any loop and full program
	//should be less than or equal to 10lines	
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	System.out.println(8);
	System.out.println(9);
	System.out.println(10);
*/	
	
		
//program:2
//i/p: I am Ram and i love java	
//o/p: 1 I 2 ,2 am 2 ,3 ram 3,4 and 3,5 i 1,6 love 4,7 java 4

	String s="I am ram and I love java";
	String ss[]=s.split("");
	for(int i=0;i<=s.length();i++)
	{
		char a[]= s.toCharArray();
		for(i=0;i<=s.length();i++)
		{
			System.out.println(a);	
		}
	}
	}
}