package com.basics.pradeep.array;

public class MathFun {

	public static void main(String[] args) {
		/*
  System.out.println("1:"+Math.min(3,5)); //minimum value
  System.out.println("2:"+Math.max(3,5)); //maximum value
  System.out.println("3:"+Math.sqrt(9));  // 4r square root
  System.out.println("4:"+Math.cbrt(7));  // 4r cube root
  System.out.println("5:"+Math.sin(90));  // sin value
  System.out.println(Math.cos(90));  // cos value
  System.out.println(Math.tan(90));  // tan value
  System.out.println(Math.ceil(7.4)); //if deciaml digit makes 
  System.out.println(Math.floor(7.4));
  System.out.println(Math.round(7.5));
  System.out.println(Math.random());  
  System.out.println(Math.random()*10000);//4r print 4digit whole number
  System.out.println(Math.abs(-5));
  System.out.println(Math.log(30));
  System.out.println(Math.log10(30));
  System.out.println(Math.pow(2,16));
	*/
// ex :1 print 6digit otp
  
  //System.out.println(Math.round(Math.random()*1000000));
	
//ex: 2 compound intrest
  /*double p=100000;
  double n=12;
  double r=7.5;
  
  double x=1+r/100;	
  double y=Math.pow(x,n);
  double ci=p*y;
  System.out.println(ci);
	
  System.out.println(Math.pow((1+r/100),n)*p);
  */
  
 //ex:3 
		//print 4digit otp in 10time

		System.out.println("  ");
		System.out.println("  ");
  for(int i=1;i<=10;i++)
  {
  System.out.println(Math.round(Math.random()*10000));
  }
  
  System.out.println("  ");
  System.out.println("  ");
  System.out.println(1/Math.cos(90));
  
  System.out.println("  ");
  System.out.println("  ");
  System.out.println(Math.round(7.5));
  
  System.out.println("  ");
  System.out.println("  ");
  System.out.println(1/Math.tan(180));

System.out.println("  ");
System.out.println("  ");
System.out.println(Math.log10(100));

System.out.println("  ");
System.out.println("  ");
System.out.println(Math.log(100));

System.out.println("  ");
System.out.println("  ");
System.out.println(Math.pow(2,16));

System.out.println("  ");
System.out.println("  ");
System.out.println(Math.pow(1024,2));
	
System.out.println("  ");
System.out.println("  ");
System.out.println(Math.sin(240));
	
System.out.println("  ");
System.out.println("  ");
System.out.println(Math.cos(180));
	}
}


