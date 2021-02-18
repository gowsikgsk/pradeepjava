package com.basics.pradeep;
import java.util.Scanner;
public class PracticeProgram {

	public static void main(String[] args) {
//ch
	//	int num=2454;
  
  /* if(num>=0&&num<=9)
  {
	  System.out.println("1digit");
  }
  else
	  if(num>=10&&num<=99)
  {
	  System.out.println("2digit");
  }else
	  if(num>=100&&num<=999)
  {
	  System.out.println("3digit");
  }else
	  if(num>=1000&&num<=9999)
  {
	  System.out.println("4digit");
  }
  ....
  .....
  */
  
  /*
  int count=0;
  for(int i=1;i<=num;i++)
  {
	  count=count+1;
  }System.out.println(count);
   */	
	
		
		
//reverse individual digit	 
		/*int num=123;
		int no=1;
		int rem,sum=0;
		switch(1)
		{
		case 1:
			while(num>0)
			{
				rem=(num%10);
				sum=sum+rem;
				num=(num/10);
			}System.out.println(sum);
			
		case 2:
			while(num>0)
			{
				rem=(num%10);
				sum=(sum*10)+rem;
				num=(num/10);
			}System.out.println(sum);
			
		case 3:
			while(num>0)
			{
				rem=(num%10);
				System.out.println(rem);
				//sum=(sum*10)+rem;
				num=(num/10);
			}//System.out.println(sum);
			
		} */
		
		/*
		int num=123;
		int rem,sum=0;
		while(num>0)
		{
			rem=(num%10);
			sum=sum+rem;
			num=(num/10);
		}System.out.println(sum);
		
		
//		
		int num=123;
		int rem,sum=0;
		while(num>0)
		{
			rem=(num%10);
			sum=(sum*10)+rem;
			num=(num/10);
		}System.out.println(sum);
		
//		
		
		int num=123;
		int rem,sum=0;
		while(num>0)
		{
			rem=(num%10);
			System.out.println(rem);
			num=(num/10);
		}System.out.println(sum);
			*/

		/*
		int num=1479;
	`	int count=0;
		while(num>0)
		{
		count=count+1;
		num=num/10;
		}System.out.println(count);
		*/
		
		
//number palindrome
	/*	int num=12321;
		int temp=num;
		int rem,sum=0;
		while(num>0)
		{
			rem=(num%10);
			sum=(sum*10)+rem;
			num=(num/10);
		}//System.out.print(sum);
		
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("nonpalindrome");
		}
		*/
		
//enter charcter until q is pressed
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		char val=sc.next().charAt(0);
		while(val!='q')
		{
		System.out.println("Enter the letter");	
		val=sc.next().charAt(0);
		}
		*/
//enter number until 0 is pressed
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		int val=sc.nextInt();
		while(val!=0)
		{
		System.out.println("Enter the letter");	
		val=sc.nextInt();
		}
		*/	
		
	/*int x=5;
	int y=x++ + ++x + x;
	System.out.println(x);
	System.out.println(y);
	*/
	
	/*	
	int a=9,b=7,c=6,d=13,e=24,f=5;
	System.out.println(a++ + b*c/d%e - --f);
	System.out.println(d%e);
	System.out.println(c/d);
	System.out.println(c/d%e);
	System.out.println(b*c/d%e);
	System.out.println(a++);
	System.out.println(--f);
	System.out.println((b*c)/d);
	System.out.println(b*c/d);	
	*/
	}
}
