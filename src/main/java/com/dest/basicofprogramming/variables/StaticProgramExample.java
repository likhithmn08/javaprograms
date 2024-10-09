package com.dest.basicofprogramming.variables;

class SampleCode{
	


	static int a,b,c;
	int p,q,r;
	static {
		a=10;
		b=20;
		c=30;
		
	}
	{
	p=100;
	q=200;
	r=300;
	a=1001;
	b=2001;
	c=3001;
	
	}
	static void display()
		{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	void display1()
	{
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		}
}
public class StaticProgramExample 
{
	public static void main(String[] args) {
		System.out.println("hi from Main");
		SampleCode.display();
		System.out.println("--------");
		SampleCode.a=111;
		SampleCode.b=222;
		SampleCode.c=333;
		SampleCode.display();
		System.out.println("-------");
		SampleCode sc = new SampleCode();
		sc.display1();
		System.out.println("-------");
		sc.display();
		
		
	}
}
