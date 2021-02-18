package com.basics.pradeep;
public class SpaceTrim {
  public static void main(String[] args) {
	String S = "i love java";
	String temp = "";
	int counter = 0;
	char cc[] = S.toCharArray();
	for (int j = 0; j <= cc.length - 1; j++) // for to count the space and word
	{ if (cc[j] == ' ') 
	  {counter = counter + 1;}
	}
	int j = 0; // initilze j for String Array Increment
	String G[] = new String[counter + 1];// space +1=word present i the String
	for (int k = 0; k <= cc.length - 1; k++) 
	{ if (cc[k] == ' ') //this condition allows only cc[k] equal to space ' '
	  {
	  G[j] = temp; //System.out.println(G[j]);
	  j++; // for increment the String Array
	  temp = ""; // empty the temp
	  }else{temp = temp + cc[k]; // this else only allow letters not space
	  //System.out.println(G[j]);
	  }
	}// for loop
	G[j] = temp; // G[3]=temp(java) , for last itertion "java" stored to temp
	//System.out.println(G[j]);
   for (int x = 0; x <= G.length - 1; x++) 
   {System.out.println(G[x]);} // to print the String Array G[]
   


 }
}