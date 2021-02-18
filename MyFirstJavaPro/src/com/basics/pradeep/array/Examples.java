package com.basics.pradeep.array;

public class Examples {

	public static void main(String[] args) {
		
//ex:1 to print element in an array
	/*
		int a[]={7,13,4,3,0,27,99};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
*/		
//ex:2 sum of elements
	/*	
		int x[]={7,3,11,9,5};
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
*/	
//ex:3 to find or search an element in an array
	/*	
		int a[]={7,11,4,75,1,95,30};
		int search=5;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if (search==a[i])
			{
				flag=true;
			}
		}
		System.out.print(flag);		
	*/
//ex:4 to count element in an array	
	/*	
		int a[]={7,11,4,75,1,95,30};
		int search=75;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if (search==a[i])
			{
				count=count+1;
			}
		}
		System.out.print(count);	
	*/
		
//ex:5 to replace an element by another element in an array
	/*	
		int a[]={656,35,3,7,12,7,5,7};
		int find=7;
		int replace=5;
		for(int i=0;i<a.length;i++)
		{
			if(find==a[i])
			{
				a[i]=replace;
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	*/	
		
//ex:6 char arrary example
	/*	
		char c[]={'a','e','i','o','u'};
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	*/
		
//ex:7 average of array
	/*
		int x[]={7,4,2};
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		double avg=sum/x.length;
		System.out.println(avg);
		*/
	
//ex:8 to find minimum value of element in an array
	/*	
		int a[]={3,5,6,7,98,2};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	*/
//ex:9 to find maximum in value of element in an array
	/*	
		int a[]={3,5,6,7,98,2,1000};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	*/
//ex:10 to find the middle value of element in an array	
	
		//even 
	/*	
		int a[]={4,6,7,16};
		
		System.out.println(a[(a.length/2)]);	
		
		System.out.println(a[(a.length/2)-1]);	
      */
		
	   //odd 
	/*	
        int a[]={4,6,2,7,16};
		
		System.out.println(a[(a.length/2)]);	
	*/

//27-11-2020 examples programs	
//	linear 
	/*	//sorting 1 method
		
		int a[]={5,4,3,2,1,9,11};
		for(int i=0;i<a.length;i++)
		{
				for(int j=0;j<a.length;j++)
				{
					System.out.println(a[i]+"-"+a[j]);
				}
				
		}
	*/	
		
	/*	//sorting 2 method
		
		int a[]={5,4,3,2,1,9,11};
		for(int i=0;i<a.length;i++)
		{
				for(int j=i+1;j<a.length;j++)
				{
					System.out.println(a[i]+"-"+a[j]);
				}
				
		}
		
		*/
// swapping in array	
//ex:11
		
	/*	//ascending order swapping
		int a[]={5,4,3,2,1,9,11};
		for(int i=0;i<a.length;i++)
		{
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]>a[j]) //greater than symbol 4r asc order
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				System.out.println(a[i]);
		}
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.println(a[i]);
		//}
	*/	
		
    //decsending order swapping
	/*	int a[]={5,4,3,2,1,9,11};
		for(int i=0;i<a.length;i++)
		{
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]<a[j]) //lesser than symbol is 4r des order
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				System.out.println(a[i]);
		}
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.println(a[i]);
	//}
*/
		
//ex: split a array into two arrays
	
		//#syntax for creating array	
				//*datatype name[]=new datatype[size]
				//*int         a[]=new int[6];
	/*	
		int x[]={5,7,8,9,0,3,5,8,3,4};
		int a[]=new int[x.length/2];
		int b[]=new int[x.length/2];
	
	//tranfer of element form x to a,b
		for(int i=0;i<a.length;i++)
		{
			a[i]=x[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			b[i]=x[a.length+i];
			System.out.print(b[i]+" ");
		}
	
*/
	
//decensing an array and split into 3arrays
	/*	
		int x[]={8,4,5,6,7,2,18,3,28,36,3,32,25,35,6,7,4,57};
		for(int i=0;i<x.length;i++)
		{
				for(int j=i+1;j<x.length;j++)
				{
					if (x[i]<x[j])
					{
						int temp=x[i];
						x[i]=x[j];
						x[j]=temp;
					}
					if(x[i]==x[j])
					{
						x[j]=0;
					}
				}
		}
		int a[]=new int[x.length/3];
		int b[]=new int[x.length/3];
		int c[]=new int[x.length/3];

		for (int i=0;i<a.length;i++)
		{
			a[i]=x[i];
			System.out.println(a[i]+" ");
		}
		System.out.println();
		for (int i=0;i<b.length;i++)
		{
			b[i]=x[a.length+i];
			System.out.println(b[i]+" ");
		}
		System.out.println();
		for (int i=0;i<c.length;i++)
		{
			c[i]=x[a.length+b.length+i];
			System.out.println(c[i]+" ");
		}
	*/
		
//when array is created initial value of element will be zero
		/*
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		*/

//ex:intersectiion
		/*	
			int a[]={1,5,11,6,9};
			int b[]={15,6,14,1,13};
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						System.out.print(a[i]+", ");
					}
				}
			}
			*/

	//to remove duplicate array
		/*	
			int a[]={14,6,11,6,9,11};
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
					}
				}
				System.out.println(a[i]);
			}
			*/

		
		
//union array/merge an array
	/*	
		int a[]={5,4,1,3,2};
		int b[]={9,7,8,6,3};
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			//System.out.println(c[i]);
		}
		for (int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
			//System.out.println(c[i]);
		}
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]);
		}
	*/
		
				
//change in char array check duplicate char as '*'
	/*	
		char c[]={'p','r','a','d','e','e','p'};
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='*';
				}
			}
			System.out.println(c[i]);
		}
	*/	
		
		
//count how many vowels present in given array
		/*
//char c[]={'p','r','a','d','e','e','p'};
char c[]={'j','a','v','a'}; 
int count=0;		

		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count=count+1;
			}
		}
		System.out.println(count);
	*/

//change lower case to upper case given char		
	/*
		char c[]={'p','r','A','d','e','E','p'}; 
			for(int i=0;i<c.length;i++)
				{
				if(c[i]>=65 && c[i]<=90)
				{
					c[i]=(char) (c[i] + 32);//lower case
				}
				else
				if(c[i]>=97 && c[i]<=122)
				{
					c[i]=(char) (c[i] - 32);//upper case
				}
				System.out.print(c[i]);
				}
		*/
	
		
			
	 /*
		char c[]={'a','R','A','D','E','E','P'};
		for(int i=0;i<c.length;i++)
		{
		if(c[i]>=65 && c[i]<=90)
		{ 
			c[i]=(char) (c[i] +32);
		}
		else
		if(c[i]>=97 && c[i]<=122)
		{
			c[i]=(char) (c[i] - 32);
		}
		System.out.print(c[i]);
		}	
		*/	
		
	}
}