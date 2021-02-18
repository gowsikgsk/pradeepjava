package com.basics.pradeep.mutablestring;

public class PT {

	public static void main(String[] args) {
	
		  long BufferStartTime=System.currentTimeMillis();
		StringBuffer sb= new StringBuffer("java");
		for(int i=1;i<=10000000;i++)
		{
			sb.append("java");
		}
		long BufferendTime=System.currentTimeMillis();
		
		long BuilderStartTime=System.currentTimeMillis();
		StringBuilder s= new StringBuilder("java");
		for(int i=1;i<=10000000;i++)
		{
			s.append("java");
		}
		long BuilderendTime=System.currentTimeMillis();
		System.out.println("buffer"+(BufferendTime-BufferStartTime)+"ms");
		System.out.println("builder"+(BuilderendTime-BuilderStartTime)+"ms");
			    
	}
}
		
	


