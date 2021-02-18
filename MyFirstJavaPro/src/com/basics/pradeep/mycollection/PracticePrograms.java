package com.basics.pradeep.mycollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class PracticePrograms {

	public static void main(String[] args) {
/*
// 1:done not exit
// Enter word and it's corresponding meaning until the word exit is enter.
// Print all the word and it's corresponding meaning then search a single word for its meaning

HashMap<String,String> hm = new HashMap<String,String>(); 
Scanner sc = new Scanner(System.in); 
for(;true;) 
{
  System.out.println("enter word:"); 
  String s = sc.next(); 
  if(s.equals("exit"))
   { 
	  break;
   }	 
   else 
   { 
	   System.out.println("enter the meaning:"); 
	    String s1=sc.next();
	    hm.put(s,s1); 
	     
   } 
}
  System.out.print(hm);
  System.out.println(sc);
  
  System.out.println("Enter word & get its meaning"); 
  String word = sc.next();
  for(String words:hm.keySet()) 
  { 
    String meaning = hm.get(words); 
	if( word.equals(words)) 
	{
	  System.out.println("word:"+words+" "+"meaning:"+meaning); 
	} 
  }
*/

/*
//2:done 
//Enter set of ph no with duplicate   &
//print it with and without duplicates
		TreeSet ts= new TreeSet();
		ArrayList al=new ArrayList(); 
		Scanner sc = new Scanner(System.in); 
		for(;true;) 
		{
		System.out.println("enter ph no :"); 
		long l =sc.nextLong(); 
		if(l!=0)
		{ 
			al.add(l);
			ts.add(l);
		} 
		else 
		{ 
			break; 
		} 
		}System.out.println("with dupilcate:"+al);
		System.out.println("with out duplicate"+ts);
*/	
	
/*
 // 3:done but not exit		
//Enter set of names and print it in attendance order
		TreeSet ts= new TreeSet();
		//ArrayList al=new ArrayList(); 
		Scanner sc = new Scanner(System.in); 
		for(;true;) 
		{
		System.out.println("enter name:"); 
		String name =sc.next(); 
		if(name!="0")
		{ 
			//al.add(name);
			ts.add(name);
		} 
		else 
		{ 
			break; 
		}
		//System.out.println(al);
		System.out.println("Ascending"+ts);

		}//System.out.println(al);
		//System.out.println("Ascending"+ts);
*/
		
/*
 // 4:error but not exit (inputmismatch)
//enter n number until q is pressed 		

		HashMap<Long,String> hm = new HashMap<Long,String>(); 
		Scanner sc = new Scanner(System.in); 
		for(;true;) 
		{
			System.out.println("enter word:"); 
			  long l = sc.nextLong();
		  if(l =="q")
		   { 
			  //System.out.println("enter word:"); 
			  //long l = sc.nextLong(); 
			    hm.put(l,null);
		    
		    }	 
		   else 
		   { 
			    break; 
		   } 
		 // System.out.println(hm);
		}System.out.println(hm);
*/
	
/*
//5:done as descending & not sorting but not exit 		
 
// Enter a name and sort its character in descending order	

		use scanner to get name -string to chararray 
		
		
		TreeSet ts= new TreeSet();
		Scanner sc = new Scanner(System.in); 
		for(;true;) 
		{
		System.out.println("enter name:"); 
		String name =sc.next(); 
		if(name!="0")
		{ 
			ts.add(name);
			ts.descendingIterator();
		} 
		else 
		{ 
			break; 
		}
		
		System.out.println("descending"+ts.descendingSet()+name);
		System.out.println("Ascending"+ts+name);

		}
		//System.out.println("descending"+ts.descendingSet());
		//System.out.println("Ascending"+ts);
*/	

		
/*
 6:done
// done but scanner doesn't wrk for switch 		
//enter the number between 1&7 to print days

		
	/*
		String day;
	    Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int num= sc.nextInt();
		 switch (num) {
	            case 1: 
	            	System.out.println(day = "Monday");
	            	break;
	            case 2: 
	            	System.out.println(day = "Tuesday");
	            	break;
	            case 3: 
	            	System.out.println(day = "Wednesday");
	            	break;
	            case 4: 
	            	System.out.println(day = "Thursday");
	            	break;
	            case 5: 
	            	System.out.println(day = "Friday"); 
	            	break;
	            case 6: 
	            	System.out.println(day = "Saturday");
	            	break;
	            case 7: 
	            	System.out.println(day = "Sunday");
	            	break; 
	            default:
	            	System.out.println(day = "Invalid day range");
	            	break;
	        }
*/

/*
 // 7:done
//done but scanner doesn't wrk for switch 		
// enter the number b/w 1to 12 to print months	
	
		 String month;
	     Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter the number");
		 int num= sc.nextInt();
		switch (num) {
	            case 1: 
	            	System.out.println(month = "jan");
	            	break;
	            case 2: 
	            	System.out.println(month = "feb");
	            	break;
	            case 3: 
	            	System.out.println(month = "mar");
	            	break;
	            case 4: 
	            	System.out.println(month = "apr");
	            	break;
	            case 5: 
	            	System.out.println(month = "may");
	            	break;
	            case 6: 
	            	System.out.println(month = "jun");
	            	break;
	            case 7: 
	            	System.out.println(month = "jul");
	            	break;
	            case 8: 
	            	System.out.println(month = "aug");
	            	break;
	            case 9: 
	            	System.out.println(month = "sep");
	            	break;
	            case 10: 
	            	System.out.println(month = "oct");
	            	break;
	            case 11: 
	            	System.out.println(month = "nov");
	            	break;
	            case 12: 
	            	System.out.println(month = "dec");
	            	break;
	            default:
	            	System.out.println(month = "Invalid month");
	            	break;
	        }
	*/

/*		
//8:
//enter two numbers and a character to perform arithmetic operator based on the character
	
		Scanner sc = new Scanner(System.in);
		for(;true;) 
		{
		System.out.println("enter name:"); 
		//Scanner sc = new Scanner(System.in);
		int s1 =sc.nextInt(); 
		//Scanner sc2 = new Scanner(System.in);
		int s2 =sc.nextInt();
		//Scanner sc3 = new Scanner(System.in);
		char s3 =sc.nextLine();
		System.out.println("s1"+"s2"+"s3"+ "=");
		}
	*/
	
	
		
  }
}

