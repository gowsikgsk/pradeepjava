package com.basics.pradeep.mycollection;

import java.util.ArrayList;
import java.util.Scanner;

public class WordDescSort {

	public static void main(String[] args) {

		///*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String s = sc.next();
		char c[] = s.toCharArray();
		 for (int i = 0; i < c.length; i++) 
		 { 
		  for (int j = i + 1; j <c.length; j++) 
		  { 
		  	if (c[i] < c[j]) 
		 	{ 
		 	 char temp = c[i]; 
		   	 c[i] = c[j];
		     c[j] = temp; 
		    } 
		 } 
		 System.out.println(c[i]); 
		 }
		 //*/
	
		
/*		
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a name");
  String s = sc.next();
  char c[] = s.toCharArray();
  //System.out.println(c);
  ArrayList al = new ArrayList();
  for (int i = 0; i < c.length; i++) 
   {
	  al.add(c[i]);
	  //System.out.println(al);
   }
	for (int i = 0; i < al.size(); i++) 
	 {
		for (int j = i + 1; j < al.size(); j++) 
		 {
			if ((char) al.get(i) < (char) al.get(j)) 
			{
				char temp = (char) al.get(i);
				al.set(i, (char) al.get(j));
				al.set(j, temp);
			}
		}
	}System.out.println("last"+al);
*/
	
/*		
	 String x,y;
	 x = "azar";
	 y = "zara";
	 System.out.println(x.compareTo(y));
*/	
	}

}