package com.basics.pradeep.array;

public class StringExamples {

	public static void main(String[] args) {

	/*	
		//char c[]={'r','a','m','a'};	reverse a char array
		//reverse by without using new char array
	
		char c[]={'r','a','m','a'};
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		
		//reverse by using new char array 
		System.out.println();
		char d[]=new char [c.length];
		for(int i=d.length-1;i>=0;i--)
		{
			d[i]=c[i];
			System.out.print(d[i]);
		}
	*/	
		
/*	
		//count no of 'a'in individual string against total count
		
		String cities[]={"chennai","madurai","theni","salem"};
		for (int i=0;i<cities.length;i++)
		{
			char a[]=cities[i].toCharArray();
			int count=0;
			for (int j=0;j<a.length;j++)
			{
				if(a[j]=='a')
				{
					count=count+1;
				}
			}
			System.out.println(count+"/"+cities[i].length());
		}
*/		

		
		//replace i to I o/p enlIsh tamIl french hIndI
		//finding the length of array length without (.length method)
		String s[]={"english","tamil","french","hindi"};
		for (int i=0;i<s.length;i++)
		{
			char b[]=s[i].toCharArray();
			int count=0;
			for (int j=0;j<b.length;j++)
			{
				count=count+1;
				/*if(b[j] == 'i')
				{
					b[j] = 'I';		
				}*/
				System.out.print(b[j]);
			}
			System.out.print(", ");
			System.out.println(count);
		}
		//*/


	//patterns program	
	/*
		String c="java";
		char s[]=c.toCharArray();
		//char s[]={'j','a','v','a'};
		for(int i=0;i<s.length;i++)
				{
					for(int j=0;j<=i;j++)
					{
						if(i==j)
						{
							System.out.print(" "+s[j]);
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println(" ");
				}
*/
		
	/*
		char s[]={'j','a','v','a'};
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+s[j]);
			}
		System.out.println(" ");
		
		*/
	/*
	char s[]={'j','a','v','a'};
	for(int i=0;i<=s.length;i++)
	{
		for(int j=0;j<=s.length-i-1;j++)
		{
			System.out.print(" "+s[j]);
		}
	System.out.println(" ");
	}
	
	*/
	
	/*		
		char s[]={'j','a','v','a'};
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+s[j]);
			}
		System.out.println(" ");
		}
		for(int i=0;i<s.length;i++)
		{
			for(int k=0;k<=s.length-i-2;k++)
			{
				System.out.print(" "+s[k]);
			}
		System.out.println(" ");
		}
		*/
		
		/*
		char B[]= {'j','a','v','a'};                //Java
		   for(int i=0;i<B.length;i++) {    //Jav
		    for(int k=0;k<=i;k++) {     //Ja
		    System.out.print(" "+B[k]);    //J
		     //System.out.print(k+"<="+i+"  ");
		    }//inner for 
		    System.out.println(" ");
		  }//outer for
		   for(int i=0;i<B.length;i++) {    
		    for(int j=0;j<=B.length-i-2;j++) {    
		    System.out.print(" "+B[j]);   
		     //System.out.print(k+"<="+i+"  ");
		    }//inner for 
		    
		    System.out.println(" ");
		  }//outer for
		*/

	}

}
