package com.methods;
/*
 A
 1 2
 B C D
 3 4 5 6
 E F G H I
 */

public class P14 
{
	public static void main(String[] args) 
	{
		int n=5;char ch='A';int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			if(i>=j)
			{
				if(i%2==0)
					System.out.print(ch++ +" ");
				else
					System.out.print(k++ +" ");
			}
			System.out.println( );
		}

	}

}
