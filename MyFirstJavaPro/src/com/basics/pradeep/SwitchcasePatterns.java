package com.basics.pradeep;

public class SwitchcasePatterns {

	public static void main(String[] args) {
		
		/*
		int i,j,k;  
        int n=5;
        int num=1;
        switch(num)
		{
case 1:	//praymid	
		System.out.println("praymid ");
		System.out.println();
	for ( i=0; i<n; i++) //outer loop for number of rows(n) 
		{ 
			for ( j=n-i; j>1; j--) //inner loop for spaces
			{ 
              System.out.print(" "); //print space
			}  
            for ( j=0; j<=i; j++ ) //inner loop for number of columns
            { 
              System.out.print("* "); //print star
            } 
          System.out.println(); //ending line after each row
		}   
		
		
case 2://reverse praymid
	System.out.println("reverse praymid");
	System.out.println();
	for ( i= 0; i<= n-1 ; i++)
		{
		   for ( j=0; j<=i; j++)
		   {
		      System.out.print(" ");
		   }
		   for ( k=0; k<=n-1-i; k++)
		   {
		      System.out.print("*" + " ");
		   }
		  System.out.println("");
		}    
case 3: //left triangle
		 System.out.println("left triangle");
		 System.out.println();
	        for(i=0; i<n; i++) //outer loop for number of rows(n) 
	        { 
	        	for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
	            {           
	                System.out.print(" "); // printing space
	            } 
	            for(j=0; j<=i; j++) //  inner loop for columns
	            {       
	                System.out.print("* "); // print star
	            }           
	          System.out.println(); // ending line after each row
	        } 
case 4: //right triangle
	System.out.println("right triangle");
	System.out.println();
		for(i=0; i<n; i++) //outer loop for number of rows(n) 
		{ 
		   for(j=0; j<=i; j++) //  inner loop for columns
           {       
                System.out.print(" *"); // print star
           }          
		   System.out.println(" "); // printing space
		} 
	      
case 5:
	
	}*/
        
	
	//numbered left angle downward
	/*	int n=3;
		int j;
		for(int i=n;i>=1;i--)
		{
			for(int k=n;k>n;k--)
			{
			System.out.print(k);	
			}
			for(j=n-i;j>=n;j--)
			{
			System.out.print(" ");
			}
			
			System.out.println("");
		}
		*/
	
		
		int n=3;
		int j,k;
		int num=1;
        switch(num)
		{
case 1:		
		System.out.println("right triangle");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for( j=n-i;j>=1;j--)
			{
				System.out.print("");
			}
			for( k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
case 2:	
		System.out.println("left triangle");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
		  for( j=n-i;j>=1;j--)
		  {
			System.out.print(" ");
		  }
		  for( k=1;k<=i;k++)
		  {
			System.out.print(i);
		  }
		 System.out.println();
		}
	
case 3:
		System.out.println("right downward triangle");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
		for(j=n;j>=1;j--)
		{
			
		}
		}
			
	}	
		
 } 
}