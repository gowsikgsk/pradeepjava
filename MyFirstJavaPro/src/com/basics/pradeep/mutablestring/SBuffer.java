package com.basics.pradeep.mutablestring;
public class SBuffer {

	public static void main(String[] args) {
	//	1.String buffer   2.String builder
	/*
	 * java 1.0(old)		* java 1.5(latest)
	 * slower				* faster
	 * synchronized			* unsynchronized
	 * thread safe			* not thread safe
	 *///common point
		/* 
		 *mutable string
		 * string literals are not stored in scp
		 */
		
		
		StringBuffer sb= new StringBuffer("java");
		sb.append(" python");
		sb.replace(2, 3, "|pradeep|");
		sb.reverse();
		sb.delete(2,4);
		System.out.println(sb);
	}
}