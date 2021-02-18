package com.basics.pradeep;

public class WorkoutExamples {

	public static void main(String[] args) {
		int num=1;
		float Fahrenheit, Celsius;
		double centimeter,inches;
		switch(num)
		{
//b/w 1 to 100 find multiples of 7 which is divided by 2
	
		case 1:	
			System.out.println();
			System.out.println("output:1");
			System.out.println();
		int count=0;
		//int i=0;
		for(int i=1;i<=100;i++)
		{
			
			if(i % 7 == 0 && i % 2==0)
			{
				count=count+1;
				System.out.print(i+"   ");
				System.out.println(count);
			}		
		}
		System.out.println();
		System.out.println("count:"+count);
	
		
// add the multiples of 7 b/w 10 to 99
		case 2:	
			System.out.println();
			System.out.println("output:2");
			System.out.println();
		int a,b=0;
		for(int i=10;i<100;i++)
		{
			
			if(i % 7 == 0)
			{
				a=i;
				b=a+b;
				//System.out.print(i+"   ");
				//System.out.println("   ");
			}
		}
			System.out.println("added value:"+b);
		

		
//convert celsius to fahrenheit
		
		case 3:
			System.out.println();
			System.out.println("output:3");
			System.out.println();
		  //float Fahrenheit, Celsius;  
         Celsius= 37;  
         Fahrenheit =((Celsius*9)/5)+32;  
   		 System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
   

		
//convert fahrenheit to celsius

		case 4: 	
			System.out.println();
			System.out.println("output:4");
			System.out.println();
         //float Fahrenheit, Celsius;  
         Fahrenheit = 100;  
         Celsius  = ((Fahrenheit-32)*5)/9;  
         System.out.println("Temperature in celsius is: "+Celsius);
  
         
//CONVERSION_INCHES_TO_CM;
 
		case 5:        
			System.out.println();
			System.out.println("output:5");
			System.out.println();
		//double centimeter;
		//double inches;
		//double inches = 11.81;
		inches = 11.81;
		centimeter  = 2.54 * inches;    
		System.out.printf("Value in Centimeter is: %.2f \n", centimeter);
  

		
//Conversion_centimeter_to_inches);

		case 6:	
			System.out.println();
			System.out.println("output:6");
			System.out.println();
		//double inches;  
		//double centimeter = 30;
		centimeter = 30;
		inches  = 0.3937 * centimeter;      
		System.out.printf("Inches is: %.2f \n", inches);   

		
		
	}
}
}