package com.basics.pradeep.constructor;
/*
 * rule:constructor name should be same as class name
 * what is constructor
 * "to initialze the value of instance data variable of the time of object"
*/
public class Student {

	static String clgname="scsvmv";
	int rollno ;
	double total;
	String name;
	char grade;
	


	public Student(int rollno, double total, String name, char grade) {
		super();
		this.rollno = rollno;
		this.total = total;
		this.name = name;
		this.grade = grade;
	Student.display();
		
	
	}

	protected static String getClgname() {
		return clgname;
	}

	protected static void setClgname(String clgname) {
		Student.clgname = clgname;
	}

	protected int getRollno() {
		return rollno;
	}

	protected void setRollno(int rollno) {
		this.rollno = rollno;
	}

	protected double getTotal() {
		return total;
	}

	protected void setTotal(double total) {
		this.total = total;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected char getGrade() {
		return grade;
	}

	protected void setGrade(char grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
//classname objectname = keyword constructor;	
	Student s1 =new Student(1,99,"hari",'a');
	Student s2 =new Student(2,89,"pradeep",'b');	
	System.out.println(s1.clgname);
	System.out.println(s1.rollno);
	System.out.println(s1.total);
	System.out.println(s1.name);
	System.out.println(s1.grade);
	System.out.println(s2.clgname);
	System.out.println(s2.rollno);
	System.out.println(s2.total);
	System.out.println(s2.name);
	System.out.println(s2.grade);
      
	}
}
