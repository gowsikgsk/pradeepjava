package com.basics.pradeep.mycollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MyHashMAp {

	public static void main(String[] args) {

	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	 hm.put(1995, "java");
	 hm.put(1989, "python");
	 hm.put(1989, "c#");
	 hm.put(2020, "gowsik");
	 hm.put(1700, "machine");
	 System.out.println(hm); 
	

	LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
	 lhm.put(1995, "java");
	 lhm.put(1989, "python");
	 lhm.put(1989, "c#");
	 lhm.put(2020, "gowsik");
	 lhm.put(1700, "machine");
	 System.out.println(lhm);
				
	
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	 tm.put(1995, "java");
	 tm.put(1989, "python");
	 tm.put(2020, "gowsik");
	 tm.put(1700, "machine");
	 System.out.println(tm);
	
	}

}
