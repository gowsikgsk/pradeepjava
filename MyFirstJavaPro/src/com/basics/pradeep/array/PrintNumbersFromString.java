package com.basics.pradeep.array;

public class PrintNumbersFromString {

	public static void main(String[] args) {
//sol:1
		String a="parent 1";
		char d[]= a.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			if(d[i] >= 48 && d[i] <=57)
			{
				System.out.println(d[i]);
			}
		}
		String b="child 2";
		char e[]= b.toCharArray();
		for(int i=0;i<e.length;i++)
		{
			if(e[i] >= 48 && e[i] <=57)
			{
				System.out.println(e[i]);
			}
		}
		String c="grandchild 3";
		char f[]= c.toCharArray();
		for(int i=0;i<f.length;i++)
		{
			if(f[i] >= 48 && f[i] <=57)
			{
				System.out.println(f[i]);
			}
		}
//sol:2		
		System.out.println(" ");
		String mno="parent 1 child 2 grandchild 3";
		char pqr[]=mno.toCharArray();
		for(int i=0;i<pqr.length;i++)
		{
			if(pqr[i] >= 48 && pqr[i] <=57)
			{
				System.out.println(pqr[i]);
			}
		}
//sol:3
		System.out.println(" ");
		String abc[]={"parent 1","child 2","grandchild 3"};
		for(int i=0;i<abc.length;i++)
		{
			char xyz[]=abc[i].toCharArray();
			for(int j=0;j<xyz.length;j++)
			{
				if(xyz[j] >= 48 && xyz[j] <=57)
				{
				System.out.println(xyz[j]);
				}
			}
		}
		
		
	}

}
