package com.basics.pradeep.array;
import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		//must declare double array [][]& curley braces must like tis {{},{},{}}
	/*	
		int a[][]={ {5,6,7} ,{1,2,3},{7,9,0}};
		int b[][]={{5,6,7},{7,1,9}};
		System.out.println(a[1][2]);
		System.out.println(b[0][2]);
	*/	
	
		//	3*3 matirix addition
	/*	
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};
		int c[][]= new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println(" ");
		}
	*/
	
    //	3*3 matirix subtraction
	/*
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{9,8,7},{6,5,4},{3,2,1}};
		int d[][]= new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				d[i][j]=a[i][j]-b[i][j];
				System.out.print("\t"+d[i][j]+"\t");
			}System.out.println("\t");
		}
	*/
	
	//transpose
	/*			
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+"	");
			}System.out.println(" ");
		}
	*/
	//diagonal	
/*
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
				System.out.print("1"+"	");
				}
				else
				{
				System.out.print("0"+"	");
				}
			}System.out.println(" ");
		}
	}
	*/
		
	//scanner class	
	//	/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		
		//String a = sc.next();
		//System.out.println(a);
		
		//String b = sc.nextLine();
		//System.out.println(b);
		
		char c = sc.nextLine().charAt(9);
		System.out.println(c);
		
//	*/
		
	/*	
		int a=21;
		// decimal to binary
		System.out.print(Integer.toBinaryString(a)+"\t");
		//decimal to octal
		System.out.print(Integer.toOctalString(a)+"\t");
		//decimal to hexadecimal
		System.out.print(Integer.toHexString(a)+"\t");
		*/
	/*
		for(int i=0;i<=100;i++)
		{
			//System.out.println("decimal"+"\t"+"binary"+"\t"+"octal"+"\t"+"hexadecimal");
			//System.out.println("decimal"+"\t"+i+"\t"+"binary"+"\t"+Integer.toBinaryString(i)+"\t"+"octal"+"\t"+Integer.toOctalString(i)+"\t"+"hexadecimal"+"\t"+Integer.toHexString(i));
		System.out.println(i+"\t"+Integer.toBinaryString(i)+"\t"+Integer.toOctalString(i)+"\t"+Integer.toHexString(i));
		}
	*/
	
	/*	
	int a[][]= new int[5][5];
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a.length;j++)
	{
		if(i==0||i==a.length-1||j==0||j==a.length-1)
		{
			a[i][j]=1;
		}
		System.out.print(a[i][j]);
	}System.out.println();
	}
	*/
	
	}
}