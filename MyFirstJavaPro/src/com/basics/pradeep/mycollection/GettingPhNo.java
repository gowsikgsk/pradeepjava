package com.basics.pradeep.mycollection;

import java.util.*;

public class GettingPhNo {

	public static void main(String[] args) {
		/*
		  //definite getting input 
		  ArrayList al=new ArrayList();
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter how many ph no u r going to enter"); 
		  int n = sc.nextInt(); 
		  for(int i=1;i<=n;i++) 
		  {
		  System.out.println("enter ph no"+i+""); 
		  long l =sc.nextLong();
		  al.add(2); 
		  }
		  System.out.println(al);
		 */

		/*
		  //indefintely getting output 
		  
		  ArrayList al=new ArrayList(); 
		  Scanner sc = new Scanner(System.in); 
		  for(;true;) 
		  {
		   System.out.println("enter ph no :"); 
		   long l =sc.nextLong(); 
		   if(l!=0)
		   { 
		   al.add(l); 
		   } 
		   else 
		   { 
		   break; 
		   } 
		   }System.out.println(al);
		*/
		/*
		  HashMap<Long,String> hm = new HashMap<Long,String>(); 
		  Scanner sc = new Scanner(System.in); 
		  for(;true;) 
		  {
		  System.out.println("enter ph no :"); 
		  long l =sc.nextLong(); 
		  if(l!=0)
		  { 
		  System.out.println("enter the name:"); 
		  String s=sc.next();
		  hm.put(l,s); 
		  } 
		  else 
		  { 
		  break; 
		  } 
		  }
		  System.out.print(hm);
		  
		  System.out.println("Enter  ph no to get name"); 
		  long h=sc.nextLong();
		  for(long ph:hm.keySet()) 
		  { 
		  String name=hm.get(ph); 
		  if(h==ph) 
		  {
		  System.out.println("phone:"+ph+"name:"+name); } }
		 */

		 /*
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		for (; true;) 
		{
			System.out.println("enter ph no :");
			String h = sc.next();
			if (h != null) 
			{
				System.out.println("enter the name:");
				String s = sc.next();
				hm.put(h, s);
			} 
			else 
			{
				break;
			}
		}
		System.out.print(hm);

		 */
	}
}