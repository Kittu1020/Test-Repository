package com.methods;
/*
 A A A A A
 * * * *
 B B B
 * *
 C
 */

public class P34 
{
	public static void main(String[] args)
	{
		int n=5;char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=(n-1))
				{
				if(i%2==0)
					System.out.print(ch);
				else
					System.out.print("*");
			}
		}
		 if(i%2==1)
			ch++;
		System.out.println( );
	}
	}
	
}
