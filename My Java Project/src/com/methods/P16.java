package com.methods;
/*
 1
 2 3
 4 5 6
 7 8 9 0
 1 2 3 4 5
 */

public class P16 
{
	public static void main(String[] args) 
	{
		int n=5;int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					if(k%10==0)
						System.out.print(k);
				}
				System.out.println( );
			}
			
			
			k++;
		}
	}

}
