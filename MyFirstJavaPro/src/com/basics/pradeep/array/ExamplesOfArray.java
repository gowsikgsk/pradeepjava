package com.basics.pradeep.array;

public class ExamplesOfArray {

	public static void main(String[] args) {
// ex: 1 print elements in odd index of an array
        /*
        int a[]={7,3,4,8,9,2,1,5,6,10};
        
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println("odd index "+i+": "+a[i]);
		}
		*/
// ex: 2 sum of element present in even index of an array
		/*
		int a[]={7,3,4,8,9,2,1,5,6,10};
		int b=0;
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println("even index "+i+": "+a[i]);
			b=b+a[i];
		}
		System.out.println(b);
		*/
// ex: 3 split an array into 2 parts one having in odd elements another having even elements
	/*	
		int a[]={7,3,4,8,9,2,1,5,6,10};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		for(int i=1;i<a.length;i=i+2)
		{	
			//System.out.print("b=");
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<a.length;i=i+2)
		{
			//System.out.print("c=");
			c[i]=a[i];
			System.out.print(c[i]+" ");
		}
	*/		
// ex: 4 print which element in 4th position of an array having size of 10 elements
	/*	
		int a[]={7,3,4,8,9,2,1,5,6,10};
		System.out.print(a[3]);
	*/	
// ex: 5 consider an array of size 10 perfom sorting and print only unique elements		
		/*
		 int a[] = {5,8,6,9,1,9,2,3,2,4};
		//int a[]={7,3,4,8,9,2,1,5,1,4,2,6,10};
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
			System.out.println(a[i]);
		}
		
		*/
		
// ex: 6 single rotation of an array {7,4,3,9,6} {4,3,9,6,7}
	 /*
	 	int a[] = {11,2,13,4,5};
	 	int temp = a[0];
		for (int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]= temp;
		for (int i=0;i<a.length;i++)
		{
System.out.print(a[i]+" ");		}
		System.out.println();
	*/
	
		
// ex: 7 consider an array of size even,sum elements in odd and even index and store it in an new array		
	  /*
		int a[]={7,3,4,8,2,6};
		int b[] =new int[a.length];
		for(int i=0;i<a.length;i=i+2)
		{
			b[i]=a[i]+a[i+1];
			System.out.println(b[i]);
		}
	  */
	/*
		int a[]={7,3,4,8,2,6};
		int b[] =new int[a.length];
		int i=0;
		int j=0;
		int k=0;
		for(j=1;j<a.length;j=j+2)
	 	{
			//int i=0; 	
			b[i]=a[j];
		 	System.out.println("odd index "+j+": "+a[j]);
		}
		
		for(i=0;i<a.length;i=i+2)
		{
			b[i]=a[i];
			System.out.println("even index "+i+": "+a[i]);
		}
		
		for(k=0;k<a.length;k++)
		{
			b[i]=a[j]+a[i];
			System.out.println(b[i]);
		}
	*/
/* 
		int a[]={7,3,4,8,9,2,1,5,6,10};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		int d[]=new int[a.length/2];
		int i;
		int j=0;
		for(i=0;i<a.length;i=i+2)
		{	
			b[j]=a[i];
			System.out.print(b[j]+" ");
			j=j+1;
		}
		System.out.println();
		System.out.println();
		j=0;
		for( i=1;i<a.length;i=i+2)
		{
		c[j]=a[i];
			System.out.print(c[j]+" ");
			j=j+1;
		}
		System.out.println();
		System.out.println();
		
		for( i=0;i<d.length;i++)
		{
				d[i]=b[i]+c[i];
				System.out.println(d[i]+" ");
		}
*/
// ex: 8 union (aUnUc)
/*
		int a[]={7,5,1,3,9,4};
		int b[]={11,12,13,9,4};
		int c[]={1,4,9,5,6};
        int d[]=new int[a.length+b.length+c.length];
		
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
		}
		for (int i=0;i<b.length;i++)
		{
			d[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			d[a.length+b.length+i]=c[i];
		}
		for (int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}

     */

// ex: 9 intersection (anbnc)
		
/*	
		
		int a[]={7,5,1,3,9,4};
		int b[]={11,12,13,9,4};
		int c[]={1,4,9,5,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				if(a[i]==b[j]&&b[j]==c[k])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	*/
		
//ex : 10 union& intersection (aUbnc)
		/*
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		int c[]={11,10,2,7,13,4,5};
		int d[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
		 	d[i]=a[i];
		}
		for (int i=0;i<b.length;i++)
		{
			d[a.length+i]=b[i];
		}
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(d[i]==c[j])
				{
					System.out.print(d[i]+" ");
				}
			}
		}
	*/
		
// ex: 11 check if b is a sub set of a		
	/*	int a[]={1,2,3,4,5,6,7,8,9};
		int b[]={3,10,4,6,7,8,9};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[j]==a[i])
				{
					count=count+1;
				}
			}
		}
		if(count==b.length)
		{
			System.out.println("b is a subset of a");
		}
		else
		{
			System.out.println("b is not a subset of a");
		}
		*/
		
//ex: 12 find first , middle,last char
	/*
		char a[]={'p','r','a','d','e','e','p'};
		{
			System.out.println("first element of array"+" "+a[0]);
			System.out.println("middle element of array"+" "+a[a.length/2]);
			System.out.println("last element of array"+" "+a[a.length-1]);
		}
	*/	
		
//ex: 13 change first charcter in arrray to caps/upper case remanin all wil b lower case		
	/*
		char c[]={'p','R','A','D','E','E','P'};
		
		for(int i=0;i<c.length;i++)
		{
		if(c[i]>=97 && c[i]<=122)
		{
			c[i]=(char) (c[i] - 32);
		}
		else
		if(c[i]>=65 && c[i]<=90)
		{ 
			c[i]=(char) (c[i] + 32);
		}
		   System.out.print(c[i]);
		}	
		*/		
		
//ex: 14 data encryption (a=b b=c ...z=a)
	/*
		//char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char c[]={'p','r','a','d','e','e','p'};
		//{q,s,b,e,f,f,q}
		for(int i=0;i<c.length;i++)
		{
		c[i]=(char) (c[i]+1);	
		System.out.print(c[i]);
		}
	*/
		 
//ex: 15 data encryption (a+1,b+2,c+3....x+24,y+25,z+26)
	/*
		char c[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//char c[]={'a','b','c','d','e'};
			   //{b,d,f,h,j}		
		for(int i=0;i<c.length;i++)
		{
		c[i]=(char) (c[i]+i+1);
		
		System.out.print(c[i]);
		}
	*/
		
//ex: 16 find the count of  lowercase uppercase ,splchar ,number in given array	
     /*
		char c[]={'p','r','a','d','e','e','p','3','1','&','1','6','p','r','i','y','a'};
		int count=0;
		int i;
		for(i=0;i<c.length;i++)
		if(c[i]>=65&&c[i]<=90)
		{
			count = count +1;
		}
		if(c[i]>=97&&c[i]<=122)
		{
			count = count +1;
		}
		if(c[i]>=33&&c[i]<=47)
		{
			count = count +1;
		}
		System.out.println(count);
		*/
				
	}

}
