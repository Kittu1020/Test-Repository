package com.methods;
/*
 A B C D E
   1 2 3 4
     F G H
       5 6
         I
 */

public class P26
{
	public static void main(String[] args) 
	{
		int n=5;char ch='A';int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				{
					if(i%2==0)
						System.out.print(ch++ +" ");
					else
						System.out.print(k++ +" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println( );
		}
	}
}
