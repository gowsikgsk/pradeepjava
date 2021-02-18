	package com.basics.pradeep;

public class SalaryHike {

	public static void main(String[] args) {
		//double anualincome=1000000;
		double salary=300000;
		int num=1;
		switch(num)
		{
		case 1: 
			System.out.println("annual income:"+salary);
			//double amount=1000000;
			num=1;
			//anualincome=salary;
			switch(num)
			{	
			case 1:		
				if(salary<=10000 && salary >=0)
					{
						salary=salary+(salary/100)*10;
						System.out.println("10% of hike in your salary");
						System.out.println("salary increment is"+salary);
					}	
					//break;
				case 2:
					if(salary<=25000 && salary >= 10001)
					{
						salary=salary+(salary/100)*7;
						System.out.println("7% of hike in your salary");
						System.out.println("salary increment is"+salary);
					}
					
				case 3:
					if(salary<=100000 && salary >= 25001)
					{
						salary=salary+(salary/100)*5;
						System.out.println("5% of hike in your salary");
						System.out.println("salary increment is"+salary);
					}
					
				case 4:
					if(salary > 100001)
					{
						salary=salary+(salary/100)*3;
						System.out.println("3% of hike in your salary");
						System.out.println("salary increment is"+salary);
					}
				}
		case 2:
			//double amount=800000;
            //anualincome=salary;
			double taxamount=0;
			double balance=0;
			num=1;
			switch(num)
			{
			case 1:
					if(salary<=250000 && salary>=0)
					{
						//System.out.println(anualincome);
						System.out.println("no tax");
						System.out.println("balance"+salary);
					}
			case 2:
					if(salary<=500000 && salary>=250001)
					{
						//System.out.println(anualincome);
						taxamount=(salary/100)*5;
						balance=salary-taxamount;
						System.out.println("tax salary"+taxamount+"     "+"tax is 5%");
						System.out.println("balance"+balance);
					}
			case 3:
					if(salary<=1000000 && salary>=500001)
					{
						//System.out.println(anualincome);
						taxamount=(salary/100)*10;
						balance=salary-taxamount;
						System.out.println("tax salary"+taxamount+"     "+"tax is 10%");
						System.out.println("balance"+balance);
					}
			case 4:
					if(salary>1000001)
					{
						//System.out.println(anualincome);
						taxamount=(salary/100)*30;
						balance=salary-taxamount;
						System.out.println("tax salary"+taxamount+"     "+"tax is 30%");
						System.out.println("balance"+balance);
					}	
			}
		}
	}
}