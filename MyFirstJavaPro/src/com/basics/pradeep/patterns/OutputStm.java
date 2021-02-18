package com.basics.pradeep.patterns;

public class OutputStm {

	public static void main(String[] args) {
		/*
		System.out.print("*");
		System.out.print("*");
		
		System.out.println("*");
		System.out.println("*");
	
		for(int i=1;i<=5;i++)
		{
		System.out.print("*");
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("*");
		}
		*/
		
	/*	
	 int n=5;
		//int b=3;
		for(int i=1;i<=n;i++)
		{
			System.out.print("#"+i);
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *"+i);
			}
			System.out.println(" ");
		} */

/*
		int a[]={10,3,14,6,17,8,19};
		int largest=a[0];
		int secondlargest=a[0];
		for(int i=0;i<a.length;i++)
		{
			for( i=0;i<a.length;i++)
			{
				if(a[i]>largest)
				{
					secondlargest = largest;
					largest =a[i];
				}
				else if(a[i]>secondlargest)
				{  //a[i]=secondlargest;
					//System.out.println("second largest is"+secondlargest);
				}
			}
		} System.out.println("second largest is"+secondlargest);
*/
///*		
		int a[]={123};
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					System.out.println("palindrome");
				}
				else
				{
					System.out.println("not a palindrome");
				}
			}
		}
//*/
	}
}