package com.methods;
/*
A A A A A
  B B B B
    C C C
      D D
        E
 */

public class P21 
{
	public static void main(String[] args) 
	{
		int n=5;char ch='A';
		for( int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
					System.out.print(ch+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println( );
			ch++;
		}
	}

}
