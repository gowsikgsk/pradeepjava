package com.basics.pradeep.patterns;

public class CheckPyramid {

	public static void main(String[] args) {
	
				//oddtriangle
		
//	/*	
		int n=5;
		int m=1;
		for (int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("i");
			}
			for(int k=1;k<=i;k++)
			{
				//System.out.print(" "+k);
				m=m+2;
				System.out.print(" "+m);
			}
			System.out.println("");
		}
	//	*/
				//even triangle
		/*
		int n=5;
		int m=0;
		for (int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				m=m+2;
				System.out.print(" "+m);
			}
			System.out.println(" ");
		} */
		
		//square;	
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)//||i==j)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
				//System.out.println(i);
			}
			System.out.println();
		}*/
	/*	
		
		for(int i =1; i<=7; i++)
		{
			System.out.print("# ");
		}
		System.out.println();
		int n=5;
		for(int i=1; i<=n;i++)
		{
			System.out.print("# ");
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println("# ");
		}
		for(int i=1;i<=7;i++)
		{
			System.out.print("# ");
		}
	 */	
		
		//3multiples&7multiples in program
		
		/*for(int i=3,j=7,k=1;k<=5;i=i+3,j=j+7,k++)
		{
			int a=i+j;
			//System.out.print(i+" "+j+"    ");
			System.out.print("");
			System.out.println(i+"+"+j+"="+a);
		}
		
		System.out.println(" ");
		System.out.println(" ");*/
		
		/*for(int i=3,j=7,k=1;k<=5;i=i+3,j=j+7,k++)
		{
			int a=i+j;
			System.out.print("");
			System.out.println(i+"+"+j+"="+a);
		}*/
		
		/*for(int i=1;i<=5;i++)
		{
			System.out.print(i*3+"  "+i*7+" ");
			//System.out.println(i*3+" + "+i*7+"="+(i*3+i*7));
		}*/
		/* //diaognol
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			System.out.println(i);
		}
		*/
		
		//print odd even in square bracket by using 3variables in single forloop
		/*
		   for(int i=0,j=1,k=1;k<=5;k++,i=i+2,j=j+2)
		 
		 
		{
			System.out.println("["+i+","+j+"]");
		} 
		*/
		//print odd even in square bracket by using single variables in  forloop
		/*for(int i=0;i<=9;i=i+2)
		{
			System.out.println("["+i+","+(i+1)+"]");
		}*/
		
		//print odd even in square bracket in while loop
		/*
		int i=0;
		while(i<=9)
		{
			System.out.print("["+i+","+(i+1)+"]");
		}
		*/
		
		//print 0to9 in <> 10to99in[] 100to999 in{}
		/*	
		for(int i=0;i<1000;i++)
		{
			if(i<10)
				{
				System.out.println("<"+i+">");	
				}
			
			if(i>=10 && i<=99)
				{
				System.out.println("["+i+"]");
				}
							
			if(i>99 && i<=999)
			 	{
				System.out.println("{"+i+"}");
			 	}
		}
	*/	
	}
}