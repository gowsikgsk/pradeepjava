package exceptionhandling;

import java.io.FileReader;
import java.io.FileWriter;

public class Exception1 {

	public static void main(String[] args) {

/*	//ArrayIndexOutOfBoundsException
			
	int a[]={7,3,1};
	System.out.println(a[3]);
*/

/*	//NullPointerException
			
	String s=null;
	System.out.println(s.length());
*/
		
/*  //StringIndexOutOfBoundsException
			
	String s="java";
	System.out.println(s.charAt(5));
*/
		
/*	//ArithmeticException
			
	int a=7;
	int b=0;
	System.out.println(a/b);
*/
		
/*	//InputMismatchException
			
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
	int a=sc.nextInt();
	System.out.println(a);
*/
 
		/*
        System.out.println("welcome");
		int a=7;
		int b=0;
		try
		{
		System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e);
//			e.printStackTrace();
		}
		finally
		{
	 	}
	 			1.finally block will always get executed.
	 			  irrespective of whatevr happens to the code
	 			2.finally is always followed by either try or catch
	 			  i.try catch finally (99%)  ii. try finally(1%)
	 			     try  						try
	 			     {							{
	 			     }							}
	 			     catch()					finally	
	 			     {							{
	 			     }							}
	 			     finally
	 			     {
	 			     }
	 		   3. usage of finally is to logout r close of db connection 
		
		System.out.println("thankyou");
		
		*/
		
/*	//	multiple exception in single line
		
		int a[]={7,0,4};
		try
		{
		System.out.println(a[2]/a[1]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	*/
		
//	# file i/o 
	//reader
		/*	try
		{
			FileReader fr =new FileReader("C:/Users/sys/Desktop/abc.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
/*//writer	
	try
	{
	FileWriter fw =new FileWriter("C:/Users/sys/Desktop/file/xyz.txt",true);
	String s=" Math is fun";
	fw.write(s);
	fw.flush();
	fw.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
		*/

	/*	try
		{
		for(int i=1;i<=10;i++)
		{
		FileWriter fw =new FileWriter("C:/Users/sys/Desktop/file/"+i+"abc.txt");
		String s=" Math is fun";
		fw.write(s);
		fw.flush();
		fw.close();
		}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	*/
	/*
		try
		{
			FileReader fr =new FileReader("C:/Users/sys/Desktop/random.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
	}
}
