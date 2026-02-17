package com.springcore.constructor_inj;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b)
	{
		this.a = a;
		this.a = b;
		System.out.println("Constroctor call : int , int ");
	}
	public Addition(double a,double b)
	{
		this.a = (int) a;
		this.a = (int) b;
		System.out.println("Constroctor call : double , double ");
	}
	
	public void doSum()
	{
		System.out.println("Sum of = "+ (this.a + this.b));
	}

}
