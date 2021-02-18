package com.basics.pradeep.array;

public class EachWordReverse 
{
  public static void main(String[] args) 
  {
	  /*String s="i love java programing";
	  for (int i=0;i<s.length();i++)
	  {
	  char a=s.charAt(i);
	  System.out.println(a);
	  }*/
	  
	  
	  String s="i love java programing";
	  String ss[]=s.split(" ");
	 //System.out.println(ss.length);
	  for (int i=0;i<ss.length;i++)
	  {
		char a[]=ss[i].toCharArray();
		//System.out.print(a);
		//for(int k=0;k<=a.length;k++)
		//{
			for(int j=a.length-1;j>=0;j--)
			{
				char temp=a[i];
				a[i]=a[j];
				a[j]= temp;
				System.out.print(a[j]);
			}
		//}
	  }
  }
}