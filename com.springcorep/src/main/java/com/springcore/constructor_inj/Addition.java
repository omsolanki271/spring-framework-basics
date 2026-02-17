package com.springcore.constructor_inj;

public class Addition {
	private int a;
	private int b;

	// move to first doulbe result call first here 
	public Addition(double a,double b)
	{
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constroctor call : double , double ");
	}
	
	public Addition(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Constroctor call : int , int ");
	}
	
	// all to compare first call string after call other double 
	public Addition(String a,String b)
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constroctor call : string  , string ");
	}
	public void doSum()
	{
		System.out.println("Sum of = " +  (this.a + this.b));
	}

}
