package com.basics.pradeep.patterns;

public class AlphabetsPatterns {

	public static void main(String[] args) {

		int num=1;
		switch (num)
		{
//print A		
			case 1:
				for(int i=1;i<=8;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==1||i==5||j==1||j==5)//||i==j)
							{
								System.out.print("*");
							}
						else
							{
								System.out.print(" ");
							}
					}
					System.out.println();
				}

//pirnt B
			case 2:
				System.out.println();
				System.out.println();
				for(int i=1;i<=8;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==1||i==4||i==8||j==1||j==5)
							{
								System.out.print("*");
							}
						else
							{
								System.out.print(" ");
							}
					}
					System.out.println();
				}
		
		
//print C
			case 3:
				System.out.println();
				System.out.println();
				for(int i=1;i<=8;i++)
					{
						for(int j=1;j<=5;j++)
						{
							if(i==1||i==8||j==1)//||i==j)
								{
									System.out.print("*");
								}
							else
								{
									System.out.print(" ");
								}
						}
							System.out.println();
					}

//pirnt D
			case 4:
				System.out.println();
				System.out.println();
				for(int i=1;i<=8;i++)
					{
						for(int j=1;j<=5;j++)
						{
							if(i==1||i==8||j==1||j==5)
								{
									System.out.print("*");
								}
							else
								{
									System.out.print(" ");
								}
						}
						System.out.println();
					}		
				
//print E
			case 5:
				System.out.println();
				System.out.println();
				for(int i=1;i<=8;i++)
					{
						for(int j=1;j<=5;j++)
						{
							if(i==1||i==5||i==8||j==1)
								{
									System.out.print("*");
								}
								else
								{
								System.out.print(" ");
								}
								//System.out.println(i);
							}
							System.out.println();
						}

//pirnt F
			case 6:			
				System.out.println();
				System.out.println();
				for(int i=1;i<=8;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==1||i==4||j==1)
							{
								System.out.print("*");
							}
						else
							{
								System.out.print(" ");
							}
								//System.out.println(i);
					}
						System.out.println();
				}
		
		
//down arrow
			case 7:
				System.out.println();
				System.out.println();
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==5||j==5||i==j)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
		
//up arrow
			case 8:
				System.out.println();
				System.out.println();
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==1||j==1||i==j)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
//left side right angle triangle
			case 9:
				System.out.println();
				System.out.println();						
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==5||j==5||i==4&j==2||i==3&j==3||i==2&j==4)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
				}

//downward right angle triangle
			case 10:		
				System.out.println();
				System.out.println();
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=5;j++)
					{
						if(i==1||j==1||i==4&j==2||i==3&j==3||i==2&j==4)
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
		
		}			
		
	}
}
