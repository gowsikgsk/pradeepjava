package com.basics.pradeep.array;

public class MyString {

	public static void main(String[] args) {
	/*	what is string
		  "string is to store group of character"
		why string is class/npt
		  String is a non primitive data type i.e,class in java ,where as in c++ string id primitive data type
		     among all  data type in c++ string data type ocupies more memory. 
		     In order to minimize the space ocupied by string, string is made has class in java
		why should optimized storage
	      As we optimize memory it reduce the latency.
	    2: string literals are represenrs in double qoutes("")
		
	    4: string literals are stored in scp.(string constant pool)
		  scp is a special memory to store string literals
		  it store only unique string literals
		  if string literals happens to be same then they are reused
		  it saves a memory "memory optimization" tis is a drawback so.,
		  once created is created & can't be change=> immutable
		  soo., string is immutable i.e, can't be modified in java
		  
		 why string is immutables
*scp allows reuseablility for string literals so many object as points 
 to same string literals*one object changing string literal will have 
 effect on other objects aswell soo string is made up of immutables in java
*in order to overcome immutable we have option of reassign(detach,attach)

		 //gc(garbage collector ) will collect the orphan storage
		  
	    5: string literals doesn't have any specific size
		      null--no sting 
		      ""--empty string
		      "a"-- string
			 "abc is a alphabet............."--string
 */

	/*	String s="  pradeep ";
				System.out.println(s.length());
				System.out.println(s.substring(3));
				System.out.println(s.substring(0, 4));
				System.out.println(s.concat("is a good boy"));
				System.out.println(s.charAt(3));
				System.out.println(s.indexOf('a'));
				System.out.println(s.indexOf('e'));
				System.out.println(s.lastIndexOf('e'));
				System.out.println(s.equals("pradeep"));
				System.out.println(s.equalsIgnoreCase("PRADEEp"));
				System.out.println(s.contains("d"));
				System.out.println(s.startsWith("p"));
				System.out.println(s.endsWith("p"));
				System.out.println(s.toUpperCase());
				System.out.println(s.toLowerCase());
				System.out.println(s.isEmpty());
				System.out.println(s.trim());
				System.out.println(s);
		*/
		
//to find vowels in given string
	//sol:1 with out convert string into char	
	/*
		String name="pradeep";
		boolean flag=false;
		for (int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				flag=true;
			}
		}
		System.out.println(flag);
	*/
	//sol:2 using convert of string into char
	/*
	  	String name="pradeep";
		boolean flag=false;
		char c[]= new char[name.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=name.charAt(i);
		}
		for (int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
			flag=true;
			}
		}
		System.out.println(flag);
*/
	
// to replace
		/*
		String name="pradeep";
		boolean flag=false;
		char c[]= new char[name.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=name.charAt(i);
		}
		for (int i=0;i<name.length();i++)
		{
			if(c[i]==('a'))
			{
				c[i]='@';
			}
			flag=true;
		}System.out.println(flag);
		for(int i=0;i<c.length;i++){
		
		System.out.print(c[i]);
		}
*/	
	
// h/w 
	///* 
		String s="Madela got noble prize for peace";
		int count=0;
		int count2=0;
		int count3=0;
		int count4=0;
		char c[]= new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{//for count vowels
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count=count+1;
			}
			else
			if(s.charAt(i)!= ' ')//for count consonents
			{
			 count2 =count2+1;
			}
			if(s.charAt(i)== ' ')//for count space
			{
				count3=count3+1;
			}
			
		}	
			System.out.println("vowels"+"-"+count);
			System.out.println("consonents"+"-"+count2);
		 	System.out.println("space"+"-"+count3);
		 	System.out.println("first char"+"-"+s.charAt(0));//for print first char
		 	System.out.println("middle char"+"-"+s.charAt(s.length()/2));//for print middle char
			System.out.println("last char"+"-"+s.charAt(s.length()-1));//for print last char
			System.out.println("length of string"+"-"+s.length());//for print full string
			
	  String a="India is My Country";
	  int i;
	  char d[]= new char[a.length()];
		for( i=0;i<d.length;i++)
		{
			d[i]=a.charAt(i);
		}
		for ( i=0;i<a.length();i++)
		{
			if(d[i]==('a'))
			{
				d[i]='@';
			}
			System.out.print(d[i]);
		}
		System.out.println();
		for(i=0;i<d.length;i++)
		{
			if (d[i]>=65&&d[i]<=90)
			{
				d[i]=(char) (d[i]+32);
			}
			
			System.out.print(d[i]);
		}
		System.out.println();
		for(i=0;i<d.length;i++)
		{
		//if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	     // if( ((i>0)&&(d[i]!=' ')&&(d[i-1]==' '))  || ((d[0]!=' ')&&(i==0)) )
	    	//{
	    	//count=count+1;
	    	    	
	    if(s.charAt(i)== ' ')//for count space
		{
			count4=count4+1;
		}
	    	}
		System.out.println(count4+1);
		//*/
	
/*
		//count no of word
		String a="a India is my country";
		  int count=0;
		  int i;
		  char d[]= new char[a.length()];
			for( i=0;i<d.length;i++)
			{
				d[i]=a.charAt(i);
			}
			for(i=0;i<d.length;i++)
			{
			if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
		      if( ((i>0)&&(d[i]!=' ')&&(d[i-1]==' '))  || ((d[0]!=' ')&&(i==0)) )
		    	{
		    	count=count+1;
		    		    	
		    if(s.charAt(i)== ' ')//for count space
			{
				count=count+1;
			}
		    	}
			System.out.println(count+1);
*/
		
	
	}
}