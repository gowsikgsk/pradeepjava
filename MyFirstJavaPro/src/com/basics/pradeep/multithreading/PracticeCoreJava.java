package com.basics.pradeep.multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

class R extends Thread {
	public void run() {
		ArrayList<String> al = new ArrayList<String>();
		String a = null;
		String s = "";
		String d = "";
		try {
			Scanner user = new Scanner(System.in);
			System.out.println("Enter the file name to read");
			a = user.nextLine();
			FileReader fr = new FileReader("C:/Users/sys/Desktop/" + a);
			int i;
			while ((i = fr.read()) != -1) 
			{
				// System.out.print((char) i);
				s = s + (char) i;
			}
			fr.close();
			d = s.toUpperCase();
			String ss[] = d.split(",");
			for (String x : ss) 
			{
				al.add(x);
				//System.out.println(x);
			}
			Collections.sort(al);
			System.out.println(al);
			/*
			//System.out.print(s);
			//System.out.print(d);
			
			for(int j=0;j<ss.length;j++)
			{
				System.out.println(ss[j]);
			}
			*/
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

class W extends Thread {
	public void run() {
	/*
		unique       :j,a,v, ,i,s,p,r,o,g,m,n,l,u,e
		repaet       :a, ,i,g,m,n
		non repeating:j,v,s,p,o,l,u,e
	*/	
		
		try 
		{
		/*unique character
		LinkedHashSet lhs = new LinkedHashSet(); 
		String s = "java is a programming language";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			lhs.add(a[i]);
		}
		String ss = lhs.toString();
		System.out.println(ss);
		FileWriter fw = new FileWriter("C:/Users/sys/Desktop/payilagamw.txt");
		fw.write(ss);
		fw.flush();
		fw.close();
		*/
			
			/*unique character
			LinkedHashSet hs = new LinkedHashSet();
			String s = "Java is a programming language";
			String as ="";
			char c[] = s.toCharArray();
			char a = ' ';
			for(int i=0; i<c.length; i++)
			{
	     		for(int j=i+1; j<c.length; j++)
		    	{
		        	if(c[i] != c[j])
			    	{
					a = c[i];
			 		}
				}
			hs.add(a);
			}
			System.out.println(hs);	
			FileWriter fw = new FileWriter("C:/Users/sys/Desktop/payilagamw.txt",true);
			fw.write(hs.toString());
			fw.flush();
			fw.close();
			 */
			
		/*reapeated characters	
		LinkedHashSet rt= new LinkedHashSet();
		String s = "java is a programming   language";
		String ss="";
		char a[]=s.toCharArray();
		char aa =' ';
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					aa=a[j];
				}
			}
			rt.add(aa);
		}
		System.out.println(rt);
		FileWriter fw = new FileWriter("C:/Users/sys/Desktop/payilagamw.txt",true);
		fw.write(rt.toString());
		fw.flush();
		fw.close();
		*/
		
		/*//nonreapting	
		
			LinkedHashSet lhs = new LinkedHashSet(); 
			String s = "java is a programming language";
			char a[]=s.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				lhs.add(a[i]);
			}
			String ss = lhs.toString();
			System.out.println("unique "+ss);
		
			LinkedHashSet rt= new LinkedHashSet();
			char aa =' ';
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						aa=a[j];
					}
					//System.out.print(aa);
				}
				rt.add(aa);
			}
			System.out.println(rt);
			LinkedHashSet nr= new LinkedHashSet();
			String nrs="";
			for(int i=0;i<a.length;i++)
			{
				if(lhs!=rt)
				{
					nr.add(lhs!=rt);
				}
			}System.out.println(nr);
			*/
		} 
		catch (Exception ee) 
		{
			System.out.println(ee);
		}
	
 }
}
public class PracticeCoreJava {

	public static void main(String[] args) {
		R r = new R();
		r.start();
		W w = new W();
		//w.start();
		
	}
}
