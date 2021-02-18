package com.basics.pradeep.array;

public class Convertions {

	public static void main(String[] args) {
	
// int to string		
	/*
		int a=1234;
		String s=Integer.toString(a);
		System.out.println(s);
	*/
	/*	
		int a=1234;
		System.out.println(a);//to print integer
		System.out.println(a+10);//to print integer with addition
		System.out.println("we"+a+(10+2));//in this + act like concat operation 
		System.out.println("we"+(a+(10+2)));//in tis + act like addition operation
		String s=String.valueOf(a);//to convert integer to string
		System.out.println(s);//to print string 
		System.out.println(s+10);//to print string with addition
		System.out.println("we"+s+(10+2));//in tis string can't add any numeric value
		System.out.println("we"+(s+(10+2)));//in tis string can't add any numeric value
	*/
// int array to string
	/*
		int a[] = {1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
		String s = Integer.toString(a[i]);
		System.out.print(s);//to print string
		//System.out.println();
		}
	*/
	/*
	   	int a[] = {1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+10);//to print integer array with addition
		System.out.println();
		System.out.print(a[i]);//to print integer array
		System.out.println();
		String s = String.valueOf(a[i]);
		System.out.print(s+10);//to print string with addition
		System.out.println();
		System.out.print(s);//to print string
		System.out.println();
		}
	*/
//string to int
	/*
		String s="1234";
		System.out.println(s);
		System.out.println(s+10);
		int a=Integer.valueOf(s);
	    System.out.println(a+10);
	    System.out.println(a);
	*/
		
	/*
		String s="1234";
		System.out.println(s);
		System.out.println(s+10);
		int a=Integer.parseInt(s);
	    System.out.println(a+10);
	    System.out.println(a);
	*/
// int to string		
		/*
			Double a=1234.0;
			String s=Double.toString(a);
			System.out.println(s);
			System.out.println(s+10);
		*/
		/*	
			Double a=1234.0;
			String s=String.valueOf(a);//to convert integer to string
			System.out.println(s);//to print string 
			System.out.println(s+10);//to print string with addition
		*/
	
//	string to char array
	/*	String s="pradeep";
		char a[]= s.toCharArray();
		System.out.println(a);
	*/
		
	/*	
		String s="pradeep";
		for(int i=0;i<s.length();i++)
		{
			char a[]=new char [s.length()];
			System.out.print(a[i]=s.charAt(i));
		}
	 */
	
//  char array to string 	
	/*	
		char a[]={'p','r','a','d','e','e','p'};
		String s = String.valueOf(a);
		System.out.println(s);
	*/
	/*
		char a[]={'p','r','a','d','e','e','p'};
		for(int i=0;i<a.length;i++)
		{
		
		}
	*/
	
//string array to string
	
	}

}