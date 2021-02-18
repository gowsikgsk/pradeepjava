package com.basics.pradeep.mycollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MyCollection {

	public static void main(String[] args) {
	/*
	 ArrayList al = new ArrayList();
	 
	al.add(5);
	al.add("mango");
	al.add('c');
	al.add(true);
	al.add(5.75);
	al.add("apple");
	System.out.println(al);
	System.out.println(al.size());
	al.remove("mango");
	System.out.println(al.size());
	System.out.println(al);
	System.out.println(al.contains("mango"));
	System.out.println(al.isEmpty());
	System.out.println(al.get(0));
	System.out.println(al.get(4));
	System.out.println(al.indexOf(true));
    al.add(1, "java");
    al.clear();
    System.out.println(al);
    System.out.println();
    
	LinkedList ll = new LinkedList();
		 
	ll.add(5);
	ll.add("mango");
	ll.add('c');
	ll.add(true);
	ll.add(5.75);
	ll.add("apple");
	System.out.println(ll);
	System.out.println(ll.size());
	ll.remove("mango");
	System.out.println(ll.size());
	System.out.println(ll);
	System.out.println(ll.contains("mango"));
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(0));
	System.out.println(ll.get(4));
	System.out.println(ll.indexOf(true));
	ll.add(1, "java");
	System.out.println(ll);
	*/
		
//how to remove duplicates	in list	 
/*		
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(4);
	
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);
		System.out.println(lhs);
		
		TreeSet ts=new TreeSet();
		ts.addAll(al);
		System.out.println(ts);
*/	
	
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(4);
		al.add(6);
	System.out.println(al);
	for(int i=al.size()-1;i>=0;i--)
	{
	System.out.println(al.get(i));
	}
	
	}
}