package com.basics.pradeep.array;

public class CheckPalindrome {

	public static void main(String[] args) {
		String s="malayalam";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length/2;i++)
		{
			char temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]= temp;
		}
		String ss=String.valueOf(c);
		if(s.equals(ss))
		{
		System.out.println("palindrome");	
		}
		else
		{
		System.out.println("not a palindrome");	
		}
		
		
 	}
}