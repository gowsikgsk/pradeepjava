package com.basics.pradeep;

public class AdvanceFor {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		/*for(int i=0;i<=a.length;i++)
		{
			System.out.println(i);
		}*/
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
