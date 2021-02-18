package com.basics.pradeep;

class xyz
{
	int a=5;
	int b=6; //getter for read //setter for write
	public int getA() {
		return a;
	}
	private void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	protected void setB(int b) {
		this.b = b;
	}
}
public class Encapsulation extends xyz{
	public static void main(String[] args) {
		xyz xa = new xyz();
		System.out.println(xa.getA()+5);
		xa.setA(6);
		System.out.println(xa.getB());
		xa.setB(5);
		System.out.println(xa.getB());
	}
}