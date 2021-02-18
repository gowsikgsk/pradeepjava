package com.basics.pradeep;

public class SwitchCase {

	public static void main(String[] args) {
		/*int mark=98;
		int num=1;
		
		switch(num)
		{
		
		case 1:
	          if(mark<=49 && mark>=0)
	          {
	        	  System.out.println("F");
	          }
		case 2:
	          if(mark<=59 && mark>=50)
	          {
	        	  System.out.println("E");
	          }
	    case 3:
		      if(mark<=69 && mark>=60)
		      {
		         System.out.println("D");
		      }
	    case 4:
		      if(mark<=79 && mark>=70)
		      {
		         System.out.println("C");
		      }
	    case 5:
		       if(mark<=89 && mark>=80)
		       {
		         System.out.println("B");
		       }
		case 6:
			   if(mark<=100 && mark>=90)
			   {
			     System.out.println("A");
			   }      
		}*/
		int a=7;
		int b=3;
		int num=3;
		int c=0;
		switch(num)
		{
		case 1:
			 c=a+b;
			System.out.println(c);
			break;
		case 2:
			 c=a-b;
			System.out.println(c);
			break;
		case 3:
			 c=a*b;
			System.out.println(c);
			break;
		case 4:
			 c=a/b;
			System.out.println(c);
			break;
		case 5:
			 c=a%b;
			System.out.println(c);
			break;
		default:
			//if(num<=0 && num>=0)
			{
				System.out.println("Invalid output");
			}
		}
   }
}
