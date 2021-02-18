package com.basics.pradeep.array;

public class checkrepeatedElement {

	public static void main(String[] args) {
		String c="pradeep";
		char d[]=new char[c.length()];
		
		for(int i=0;i<c.length();i++)
		{
			d[i]=c.charAt(i);
		}
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					System.out.println("first reapting element"+" "+d[j]);
				}//break;
			}			break;
		}
		
	/*	//int array[] = {114, 225, 669, 996, 336, 6547, 669, 225, 336, 669, 996, 669, 225 };
		char array[] = {'a','b','c','a','e','b','c'}; 
		System.out.println("");
	      //Creating the count array
	      int countArray[] = new int[array.length];
	      for(int i=0; i<array.length; i++) 
	      {
	         countArray[i] = 0;
	      }
	      for(int i=0; i<array.length; i++) 
	      {
	         for(int j=0; j<array.length;j++) 
	         {
	            if(i!=j && array[i]==array[j]) 
	            {
	               countArray[i]++;
	            }
	         }
	      }
	     // System.out.println(Arrays.toString(countArray));
	      //First non-repeating element in the array
	      for(int i=0; i<array.length; i++) 
	      {
	         if(countArray[i]==0) 
	         {
	            System.out.println(array[i]);
	            break;
	         }
	      }
	  */ 
		/*
		  int array[] = {114, 225, 669, 996, 336, 6547, 669, 225, 336, 669, 996, 669, 225 };
	
		//char array[] = {'a','b','c','a','e','b','c'}; 
		System.out.println("");
	      //Creating the count array
	   // int count=0; 
	    int count1=0;
		//int countArray[] = new int[array.length];
	      //for(int i=0; i<array.length; i++) 
	      //{
	        // count = 0;
	      //}
	      for(int i=0; i<array.length; i++) 
	      {
	         for(int j=0; j<array.length;j++) 
	         {
	            if(i!=j && array[i]==array[j]) 
	            {
	               count1=count1+1;
	            }
	         }
	      }
	     // System.out.println(Arrays.toString(countArray));
	      //First non-repeating element in the array
	      for(int i=0; i<array.length; i++) 
	      {
	         if(count1==0) 
	         {
	            System.out.println(array[i]);
	            break;
	         }
	      }count1=0;
	*/
	}
}
