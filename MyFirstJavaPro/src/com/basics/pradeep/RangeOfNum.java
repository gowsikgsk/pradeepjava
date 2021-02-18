package com.basics.pradeep;

public class RangeOfNum {

	public static void main(String[] args) {

		for (int num = 1; num <= 1000; num++) {
			int sum = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (num == sum) {
				System.out.println("perfect number" + num);
			} else {
			//	System.out.println("not a perfect number" + num);
			}
		}
	}

	/*	for(int num=1;num<=100;num++)
		{
			// num=6;
			int count=0;
			for(int i=2; i<num;i++)
			 {
		      if(num % i==0)
		      {
		    	 count=count+1;
		      }
		     }
			if(count==0)
			{
				System.out.println("prime number"+num);
			}
			else
			{
				System.out.println("non prime number"+num);
			}
		}
		*/
	}
