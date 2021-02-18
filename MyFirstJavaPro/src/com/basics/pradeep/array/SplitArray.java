package com.basics.pradeep.array;

public class SplitArray {

	public static void main(String[] args) {
//chararray to string convetrion 
		char c[]={'a','e','i','o'};
		/*String s="";
		for(int i=0;i<c.length;i++)
		{
			s=s+c[i];
		}System.out.println(s);
		*/
	/*	
//by using valueof to convert		
		String s=String.valueOf(c);
		System.out.println(s);
		*/
		
		/*	String s="ram like java";
		byte r[]= s.getBytes();
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i]);
		}System.out.println();
		System.out.println();
		String rr[]=s.split("a");
		for(int i=0;i<rr.length;i++)
		{
		System.out.println(rr[i]);		
		}
		System.out.println();
		System.out.println();
		char rrr[]=s.toCharArray();
		for(int i=0;i<rrr.length;i++)
		{
			System.out.println(rrr[i]);
		}
		System.out.println();
		System.out.println();
		//char rrr[]=s.toCharArray();
		String ss=String.valueOf(rrr);
		System.out.println(ss);
*/
		
		
	/*
		String b[]={"ram","like","java"};
	String bb="";
	//String bb[]=String.valueOf(b);
	for(int i=0;i<b.length;i++)
	{
		bb=bb+b[i]+" ";
	}System.out.println(bb);
*/
	/*
		String s="india";
		String ss="india is my country";
		char a[]=s.toCharArray();//tis is 4r change the string in a[] as char 
		String b[]=ss.split(" ");//tis is 4r split the string in b[] as string array 
		char c[]=ss.toCharArray();//tis is 4r change the string in c[] as char 
		for(int i=a.length-1;i>=0;i--)// mirror 4r string
		{
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=b.length-1;i>=0;i--) //reverse the string
		{
			System.out.print(b[i]);
		}
		System.out.println();
		for(int i=c.length-1;i>=0;i--)// mirror 4r string
		{
			System.out.print(c[i]);
		}
*/
	
		/*
		// find the word in given sentence
		String s="india is my country";
		int count=0;
		boolean flag=false;
		String ss[]=s.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			if(ss[i].equals("is"))
			{
				count=count+1;
				flag=true;
				ss[i]="the";
			}System.out.print(ss[i]+" ");
		}System.out.println();
		System.out.println(flag);
	System.out.println(count);
	*/
	
//to print odd word
	/*
	   String c="today is friday";
	 
	String cc[]=c.split(" ");
	for(int i=0;i<cc.length;i++)
	{ 
		if(cc[i].length()%2!=0)
		{
			System.out.println(cc[i]);
		}
	}
	*/
	
		
// h/w 
		/*
		String s="mississippi is a place";
		int count=0;
		int count2=0;
		int i;
		//S.replace("is","the");//for replace every letter
		String ss[]=s.split(" ");
		for( i=0;i<s.length();i++)
			if(s.charAt(i)== ' ')//for count space
			{
				count=count+1;
			}
			System.out.println(count);
		
		
		//int i;
		boolean flag=false;
		for(i=0;i<s.length();i++)
		if(ss[i].equals("is"))
		{
			count2=count2+1;
			flag=true;
			System.out.println(count2);
		System.out.println(flag);
		}
		
		
	*/

	
	
	}
}
