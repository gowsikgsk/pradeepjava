package com.basics.pradeep.array;

public class PracticeArraysPrograms {

	public static void main(String[] args) {
	/*	//1. Write a Java program to find the 
		//duplicate values of an array of string values
	
	String s[]={"pradeep","is","good boy","pradeep","is","a","is","lazy"};
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[i]==s[j])
			{
				//s[j]="";
				System.out.println(s[j]);
				break;
			}
		}
	}	*/
	/*
		//Write a Java program to find the 
		//common elements between two arrays of integers
	
	int a[]={1,2,3,4,5,6,7};
	int b[]={4,5,6,7,8,9,0};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(b[j]);
			}
		}
	}	*/
	
	/*	//Write a Java program to sort a numeric array
		int a[]={3,2,4,5,1,7,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	*/
		
//	/*	//Write a Java program to find the 
		//second largest element in an array	
		
		int a[]={3,2,4,5,1,7,7,6,8,8,9,9,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				/*if(a[i]==a[j])
				{
					a[]
				}*/
			}
			//System.out.println(a[i]);
		}
		System.out.println(a[1]);
		System.out.println();
		if(a[0]==a[1])
		{
			System.out.println(a[2]);
		}
//	*/
	/*	
		//Write a Java program to sort a String array
		String s[]={"pradeep","is","a","boy"};
		for(int i=0;i<s.length;i++)
		{
		 char c[]= s[i].toCharArray();
		 System.out.println(c);
			//System.out.println(s[i].length());
		}  
		int count=s[i].length;
			
		for(int m=0;m<count;m++)
		{
			for(int n=m+1;n<s.length;n++)
			{
				if(count[m]<s[n])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		*/
		
		
	}
}