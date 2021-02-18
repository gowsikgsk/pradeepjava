package com.basics.pradeep;
public class Arithmetic {
    void add()
    {
    	int a=2;
    	int b=3;
    	int c=a+b;
    	System.out.println(c+ "is addition value");
    }
    void sub()
    {
    	int a=2;
    	int b=3;
    	int c=a-b;
    	System.out.println(c+ "is subracted value");
    }
    void oddoreven()
    {
    	for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("even"+i);
			}
			else
			{
				System.out.println("odd"+i);
			}
		}

    }
	public static void main(String[] args) 
	{
		Arithmetic ari = new Arithmetic();
		 ari.add();
		 ari.sub();
		 ari.oddoreven();
	}
}