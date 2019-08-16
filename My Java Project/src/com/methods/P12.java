package com.methods;
/*
 1
 0 1
 0 1 0
 1 0 1 0
 1 0 1 0 1
 */

public class P12 
{
	public static void main(String[] args) 
	{
		int n=5;int k=1;
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				k=count%2;
					System.out.print(k); 
			count++;
			}
			System.out.println( );
		}
    	 
    }
}
