package com.basics.pradeep;

public class PerfomanceTesting {

	public static void main(String[] args) {
		long StartTime=System.currentTimeMillis();
		for(int i=0;i<=100000000;i++)
		{
			System.out.println(i);
		}
		long endTime=System.currentTimeMillis();
		long sec;
		sec=(endTime-StartTime)/1000;
		//time=time/1000;
		System.out.println(sec+"sec");
	
	}
}
