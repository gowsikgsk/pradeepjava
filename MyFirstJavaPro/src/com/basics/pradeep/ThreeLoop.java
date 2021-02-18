package com.basics.pradeep;

public class ThreeLoop 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++ )
		{
			for (int j=1;j<=1000;j++)
			{
				for(int k=1;k<=1000;k++)
				{
					System.out.println(i+""+j+""+k);
				}
			}
		}
	}
}
