//sample program for widening
package com.primitivetypecasting;

public class P2 
{
	public static void addition(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		addition(10.0,'a');
		addition(10.0,12.3);
		addition('a','b');
		addition(10.0f,2);
	}
}
 